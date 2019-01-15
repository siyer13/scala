
import java.sql.{Connection,DriverManager}

object BatchJobUpdate  {
    var connection:Connection = null
    def queryDB(url : String,driver : String,username : String,password : String)  {
        Class.forName(driver)
        connection = DriverManager.getConnection(url,username,password)
        val statement = connection.createStatement
        statement.executeUpdate("UPDATE batch_jobs SET end_time =  curtime() where status = 'Running' ")
        connection.close
	}
}
