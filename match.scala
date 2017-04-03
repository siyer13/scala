def findMe(word: String) {
  word match {
    case "salt" => println("pepper")
    case _ => println("huh ?")
  }
}

findMe("hello")
