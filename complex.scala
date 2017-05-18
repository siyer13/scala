class Complex(real: Double, complex: Double) {
  def r = real
  def c = complex
  override def toString() =
    "" + r + (if (c < 0) "" else "+") + c + "i"
}

val c = new Complex(5, 3)
println(c)
