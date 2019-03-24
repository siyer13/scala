package com.siyer.file

import java.io._
import scala.util.Properties
import java.util.Properties

object PropertiesFileWriter {
  def main(args: Array[String]) {
    val number = 10
     val writer = new PrintWriter(new File("oozie.properties"))
     writer.write("number="+number)
     writer.close()
    val prop = new Properties()
    val propsFile = new File("oozie.properties")
    if (propsFile.exists()) {
      prop.load(new FileInputStream(propsFile))
      println("properties file loaded")

      val output = new FileOutputStream(propsFile)
      prop.put("nextNumber", "20")
      prop.store(output, null)
    }
  }
}
