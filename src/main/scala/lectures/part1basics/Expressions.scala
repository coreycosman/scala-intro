package lectures.part1basics

object Expressions extends App {
  // If Expressions

  val isTrue = true    
  val testVal = if (isTrue) 42 else 43
  println(testVal)

  // everything in scala is an Expression
  // instructions vs expressions:
      // instructions are executed (do something)
      // expressions are evaluated (give value of something)
  // avoid loops and imperative code that create side effects 
  // side effects examples: println, whiles/loops, reassigning, expressions returning Unit

  // code blocks (val of the codeBlock === the last statement):

  val codeBlock = {
    val y = 2
    val z = y + 1

    if (y < 2) "hello" else "sup"
  }
  println(codeBlock)
}