object MySQL {
  def main(args: Array[String]) {
    BatchJobUpdate.queryDB("jdbc:mysql://192.168.2.7:3306/hadoop","com.mysql.jdbc.Driver","root","password")
  }
}
