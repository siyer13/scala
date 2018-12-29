import java.sql.{Connection,DriverManager}

object ScalaJdbcConnectSelect extends App {

  // connect to the mysql database
  val url = "jdbc:mysql://localhost:3306/school"
  val driver = "com.mysql.jdbc.Driver"
  val username = "root"
  val password = ""
  var connection:Connection = _

  try {
    Class.forName(driver)
    connection = DriverManager.getConnection(url,username,password)
    val statement = connection.createStatement
    val rs = statement.executeQuery("select student_id, first_name from student")
    while(rs.next) {
      val student_id = rs.getString("student_id")
      val first_name = rs.getString("first_name")
      println("student_id = %s , first_name = %s".format(student_id,first_name))
    }
  }catch {
    case e: Exception => e.printStackTrace
  }
  connection.close
}
