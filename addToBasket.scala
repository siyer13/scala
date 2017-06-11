import scala.collection.mutable.ArrayBuffer

var fruits =  ArrayBuffer("apple")

val addToBasket = (fruit: String) => {
  fruits += fruit
  println(fruits.mkString(", "))
}

def buyStuff(f: String => Unit, x: String) {
  f(x)
}

buyStuff(addToBasket,"grapes")
buyStuff(addToBasket,"cherries")
buyStuff(addToBasket,"oranges")
buyStuff(addToBasket,"banana")
