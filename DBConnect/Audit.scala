import java.sql.{Connection,DriverManager}

object BatchJobUpdate  {
    var connection:Connection = null
    def queryDB(url : String, driver : String, username : String, password : String, uniqueID : String, countryCode : String, productCode : String, dataUnit : String, organizationCode : String, rptPrd : String, version : String, spkUniqueId : String)  {
        Class.forName(driver)
        connection = DriverManager.getConnection(url,username,password)
        val statement = connection.createStatement
        statement.executeUpdate("UPDATE RRTS_PROC_CTRL_AUDIT SET AWP_PROC_END_TIME = SYSDATE WHERE PROC_NM = 'STD INGESTION' AND UNIQUE_ID ='" + uniqueID + "'")
		
		statement.executeUpdate("UPDATE DMART.RRTS_PROC_CTRL_AUDIT SET AWP_PROC_END_TIME = SYSDATE WHERE PROC_NM = 'SPK STD INGESTION' AND UNIQUE_ID = " + uniqueID + " AND AWP_PROC_EXEC_ID = (SELECT MAX(AWP_PROC_EXEC_ID) FROM DMART.RRTS_PROC_CTRL_AUDIT WHERE PROC_NM = 'SPK STD INGESTION' AND UNIQUE_ID = " + uniqueID + ")")
		
		var cdlpSQL = "SELECT TRIM(CDPL.CDPL_ID) FROM rrts_daq.TR_CDPL_INFO_CDPL, rrts_daq.TR_DATA_UNIT DU, rrts_daq.TR_LOB LO WHERE CDPL.data_unit_id AND LO.LOB_ID = CDPL.LOB_ID AND CDPL.CNTRY_CD = :c_country_code AND CDPL.RTL_RISK_PROD_CAT_CD = :c_product_code AND DU.DATA_UNIT_NM = :c_data_unit AND LO.LOB_CD = :c_oraganization_code"
		var rs: ResultSet = executeQuery(cdlpSQL, {"c_country_code" : countryCode, "c_product_code" : productCode, "c_data_unit" : dataUnit, "c_oraganization_code" : organizationCode})
		
		var cdlpID = 9999
		if(rs.next()) {
			cdlpID = rs.getInt(1)
		}
		if(cdlpID == null || cdlpID = "" ) {
			cdlpID = 9999
		}
		var selectStatement = "SELECT rrts_daq.pkg_trl_dml_all_partn_dtl.func_all_partn_dtl(:p_cdlp_id, :p_reporting_prd, :p_versn, :p_unique_id, 'Completed', 'ORA2STD', 'CLEAR', 'NO', :p_remarks, 'RISK_ONLY', 'gfrrsnee') from dual"
		statement.executeQuery(selectStatement, {"p_cdlp_id": cdlpID, "p_reporting_prd" :rptPrd, "p_versn" : version, "p_unique_id" : spkUniqueId, "p_remarks" : 'RISK(02) Data' + spkUniqueId } )
		
		connection.close
	}
}



object Oracle {
  def main(args: Array[String]) {
	BatchJobUpdate.queryDB(args(0),args(1),args(2),args(3),args(4),args(5),args(6),args(7),args(8), args(9), args(10), args(11))
  }
}
  
  
