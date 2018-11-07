import com.google.gson.Gson

import scala.collection.mutable._
import net.liftweb.json._
import net.liftweb.json.Serialization.write

case class Person(name: String, address: Address)
case class Address(city: String, state: String)

object GsonTest extends App {

  val p = Person("Sridhar Iyer", Address("Hyderabad", "Telangana"))

  val gson = new Gson
  val jsonString = gson.toJson(p)
  println(jsonString)
}

object LiftTest extends App {

  val P = Person("Sridhar Iyer", Address("San Fransisco", "California"))

  implicit val formats = DefaultFormats
  val jsonString = write(P)
  println(jsonString)
}
