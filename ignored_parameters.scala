List(1, 2, 3) foreach { _ => println("Hi") }

List(1, 2, 3) foreach println _


Some(5) match { case Some(_) => println("Yes") }

val mappy = List(1, 2, 3) map (_ + 2)

println(mappy)


val leftSum = List(1,2,3,4,5).reduceLeft(_+_)

println(leftSum)

val rightSum = List(1,2,3,4,5).reduceRight(_+_)

println(rightSum)


val list_map = List(1,2,3,4) map(3 * _)

println(list_map)
