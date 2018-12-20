val list = List("CAR", "MELON", "HOUSE","ARC")
val sortedList = list.map(s => new String(s.toCharArray.sorted))
println(sortedList)
//val sortedListMap = list.flatMap(s => new String(s.toCharArray.sorted)).sorted
//println(sortedListMap)
