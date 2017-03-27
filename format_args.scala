def formatArgs(args : Array[String]) = mkString("\n")

val res = formatArgs(Array("One","Two","Three"))
assert(res=="One\nTwo\nThree\n")
