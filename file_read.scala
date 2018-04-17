import scala.io.Source

val filename = "capitals.scala"

for(line <- Source.fromFile(filename).getLines) {
    println(line)
}
