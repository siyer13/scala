val numbers = Array(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
println(numbers)
println(numbers(3))
// Arrays are mutable and hence will work
numbers(3) = 10
println(numbers(3))
for(number <- numbers)
  print(number)

println()

val greetings = new Array[String](3)
greetings(0) = "Hello, "
greetings(1) = "Good Morning! "
greetings(2) = "Sridhar."

for(greet <- greetings)
  print(greet)

println()
// another way
for( i <- 0 to 2)
  print(greetings(i))
