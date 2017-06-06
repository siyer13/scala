trait Shape {
  def area(): Int
}

class Square(length: Int) extends Shape {
  def area = length * length
}


val square = new Square(10)
println(square.area)
