import java.sql.{Connection,DriverManager}

object ScalaJdbcConnectSelect extends App {

  // connect to the mysql database

  val url = "jdbc:mysql://localhost:3306/test"
  val driver = "com.mysql.jdbc.Driver"
  val username = "root"
}
