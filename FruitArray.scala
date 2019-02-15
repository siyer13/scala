scala> val fruitArray = Array("Apple", "banana", "mango")
fruitArray: Array[String] = Array(Apple, banana, mango)

scala> val BigFruitArray = for ( fruit <- fruitArray) yield {
     | val f = fruit.toUpperCase
     | f
     |
     | }
BigFruitArray: Array[String] = Array(APPLE, BANANA, MANGO)
