scala> val s = "abcd"
s: String = abcd

scala> s.foreach(println)
a
b
c
d

scala> s.getBytes.foreach(println)
97
98
99
100

scala> val sbytes = s.getBytes
sbytes: Array[Byte] = Array(97, 98, 99, 100)

scala> sbytes
res12: Array[Byte] = Array(97, 98, 99, 100)

scala> (sbytes.map(_.toChar)).mkString
res13: String = abcd

scala> sbytes.map(_.toChar)
res14: Array[Char] = Array(a, b, c, d)

scala> val newS = (sbytes.map(_.toChar)).mkString
newS: String = abcd
