def sum1(num1: Int, num2: Int) = num1 + num2

def sum2(num1: Int, num2: Int) = num1 + num2

def sum3(s1:(Int,Int) => Int, s2: (Int,Int) =>  Int, a: Int, b:Int, c:Int, d:Int)  = s1(a,b) + s2(c,d)


println(sum3(sum1,sum2,2,3,4,5))


def doubleMe(number: Int)  = number * 2

def halfMe(number: Int) = number / 2

def showMe(num1: Int, num2: Int, m1: Int  => Int, m2: Int => Int ) : Int = {
  m1(num1) + m2(num2)
}

println(showMe(4,8,doubleMe, halfMe))
