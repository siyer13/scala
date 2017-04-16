
class Rational (n: Int, d: Int) {
    // The require method takes one boolean parameter.
    // If the passed value is true, require will return normally.
    // Otherwise, require will prevent the object from being constructed by throwing an IllegalArgumentException.
    require (d != 0)
    override def toString = n + " / " + d
}
println(new Rational(3,5))
