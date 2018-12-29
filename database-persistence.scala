import java.sql.{Connection,DriverManager}

object ScalaJdbcConnectSelect extends App {

  // connect to the mysql database

  val url = "jdbc:mysql://localhost:3306/test"
  val driver = "com.mysql.jdbc.Driver"
  val username = "root"
  val password = ""
  var connection:Connection = _

  try {
    Class.forName(driver)
    connection = DriverManager.getconnection(url,username,password)
    val statement = connection.createStatement
  }
}
