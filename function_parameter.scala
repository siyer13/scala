// You want to create a method that takes a simple function as a method parameter.

def executeMethod(callback: () => Unit) = {
  callback()
}

val sayHello = () => { println("Hello Sridhar")}


executeMethod(sayHello)
