def add(num1: Int)(num2: Int): Int = num1 + num2

println(add(4)(5))

val addFour = add(4)_

println(addFour(2))
