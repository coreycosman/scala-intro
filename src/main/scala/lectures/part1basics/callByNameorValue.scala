package lectures.part1basics

object CallByNameOrValue extends App {
  // evaluated at compile time
  // value passed in is used in function definition, computed before function is called
  def calledByValue(n: Long): Unit = {
    println(s"called by value $n")
    println(s"called by value $n")
  }
  // lazy evaluation (evaluated at runtime)
  // param passed in is not computed before function is called, an expression instead of a value is passed into function as parameter, at that expression is evaluated at runtime, every time function is called
  def calledByName(n: => Long): Unit = {
    println(s"called by name $n")
    println(s"called by name $n")
  }

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirstByValue(x: Int, y: Int) = println(x)
  def printFirstByName(x: Int, y: => Int) = println(x)

  printFirstByName(2, infinite())
  // printFirstByValue(2, infinite()) // stack overflow error
}