def isPrime(num: Int, start: Int, count: Int): Boolean = {
  if(count > 2) return false
  if(start >= num) return true
  if(num%start == 0) isPrime(num,start+1,count+1)
  else isPrime(num,start+1,count)
}

println(isPrime(99,1,0))
println(isPrime(17,1,0))
