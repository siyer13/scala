class Rational (n: Int, d: Int) {
    require (d != 0)
    override def toString = n + " / " + d
}
println(new Rational(3,5))
