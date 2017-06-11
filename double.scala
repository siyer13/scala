def double_value(i: Int) = i * 2

println(double_value(2))


val db = (i:Int) => { i * 2 }

println(db(2))


val list = List.range(1,5)
println(list)

val list_double = list.map(db)
println(list_double)
