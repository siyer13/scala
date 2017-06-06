trait Shape {
  def area(): Int
}

class Square(length: Int) extends Shape {
  def area = length * length
}


class Rectangle(length: Int, breadth: Int) extends Shape {
  def area = length * breadth
}

val square = new Square(10)
val rectangle = new Rectangle(10,20)
println(square.area)
println(rectangle.area)
