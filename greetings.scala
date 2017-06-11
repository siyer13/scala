def greetings(language: String) = (name: String) => {
  language match {
    case  "english" => "Hello !!! " + name
    case  "spanish" => "Buenos Dias " + name
    case  "hindi"   => "Namaskar " + name
  }
}

val hindi = greetings("hindi")
println(hindi("Sridhar"))
