// Lists are immutable
val numbers = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
println(numbers)
println(numbers(3))
// this will throw error and will not compile
numbers(3) = 10
println(numbers(3))
