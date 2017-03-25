var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}


// arguments in functional way

args.foreach((arg: String) => println(arg))
