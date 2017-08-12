val divide = (x: Int) => 42 / x

print(divide(7))
//print(divide(0))



val div = new PartialFunction[Int, Int] {
  def apply(x: Int) = 42 / x
  def isDefinedAt(x: Int) = x != 0
}


//print(div(0))
print(div(7))
println(div.apply(6))
print(div.isDefinedAt(0))
