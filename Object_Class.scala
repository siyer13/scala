
object Test {
  
  def main(args : Array[String]) {
    println("HEllo Scala IDE")
    
    val t =  Test
    val e = Test
    println(t)
    println(e)
    
    val Te = new TestClass()
    println(Te)
    val Cl = new TestClass()
    println(Cl)
  }
  
  class TestClass {
    
    def someMethod() {
      
    }
  }
}


/*

Output:

HEllo Scala IDE
com.imf.data.Test$@7b23ec81
com.imf.data.Test$@7b23ec81
com.imf.data.Test$TestClass@6acbcfc0
com.imf.data.Test$TestClass@5f184fc6


*/
