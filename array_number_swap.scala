val a = Array(1,2,3,4,5,6,7,8)

for( i <- 0 until (a.length,2)) {
  print(a(i))
}

for( j <- 1 until (a.length,2)) {
  print(a(j))
}




def swap_array(a:Array[Int], i: Int, j:Int) : Array[Int] = {
  if(i >= a.length-1) return a
  else {
    var temp = a(j)
    a(j) = a(i)
    a(i) = temp
    return swap_array(a,i+2,j+2)
  }
}


val b = swap_array(a,0,1)

for( k <- 0 until (b.length)) {
  print(b(k))
}

val tz = java.util.TimeZone.getAvailableIDs()
for(t <- tz)
println(t)
