  def double_method(i: Int) = { i * 2 }
println(double_method(2))


val double_value = (i:Int) => { i * 2 }
println(double_value(2))


val list = List.range(1,5)
println(list)

val list_double = list.map(double_value)
println(list_double)


val double_double = list_double.map(double_method)
println(double_double)
