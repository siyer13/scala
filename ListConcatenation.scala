val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo)
println(threeFour)
println(oneTwoThreeFour)


// List cons :: prepends the element to the List

val one = List(1)
val two = List(2)
val oneToo = one ::: two
println(oneToo)
val zeroOneTwo = 0 :: oneToo
println(zeroOneTwo)
