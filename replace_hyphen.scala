scala> val arr = Array("J-L", "JL", "JK-LL")
arr: Array[String] = Array(J-L, JL, JK-LL)

scala> arr.map(x => x.replaceAll("-",""))
res1: Array[String] = Array(JL, JL, JKLL)
