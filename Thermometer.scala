class Thermometer {

  var celsius: Float = _

  def farenheit = celsius * 9 / 5 + 32
  def farenheit_= (f: Float) {
    celsius = (f - 32) * 5 / 9
  }
  override def toString = farenheit + "F/"+ celsius + "C"
}


val t = new Thermometer
t. celsius = 100
println(t)
t.farenheit = -40
println(t)
t.farenheit = 66
println(t)
t.farenheit = 76
println(t)
t.farenheit = 86
println(t)
