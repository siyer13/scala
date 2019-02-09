
package com.imf.data

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
    
    val m1 = Message("siyer@gmail.com", "siyer13@gmail.com", "Hello, How are you ?")
    val m2 = Message("siyer@gmail.com", "siyer13@gmail.com", "Hello, How are you ?")
    
    val m = m1 == m2
    val mm = m1.equals(m2)
    
    println(m)
    println(mm)
    
    
  }
  
  class TestClass {
    
    def someMethod() {
      
    }
  }
  
  case class Message(sender: String, recepient: String, messageBody: String) {
    
   
  }
}


/*

Output:

HEllo Scala IDE
com.imf.data.Test$@7b23ec81
com.imf.data.Test$@7b23ec81
com.imf.data.Test$TestClass@6acbcfc0
com.imf.data.Test$TestClass@5f184fc6
true
true
*/
