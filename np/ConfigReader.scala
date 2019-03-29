import com.siyer.config.{Database}
import pureconfig.error.ConfigReaderFailures
import pureconfig.loadConfig
import pureconfig.generic.auto._


object ConfigReader {
  def main(args: Array[String]): Unit = {
    val simpleConfig: Either[ConfigReaderFailures, Database] = loadConfig[Database]
    simpleConfig match {
      case Left(ex) => ex.toList.foreach(println)
      case Right(config) => println(s"Database url ${config.database.oracle.url}")
    }
  }
}
