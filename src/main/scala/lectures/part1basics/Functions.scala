package lectures.part1basics

object Functions extends App {
  // val and return types are inferred 
  // best practice is to annontate return types
  def func(a: String, b: Int): String = {
    a + " " + b
  }
  println(func("sup", 3))
  
  // functions defined with parentheses must be called with them
  // functions defined without parentheses must be called without them
  def paramaterlessFuncWithParens(): Int = 42
  println(paramaterlessFuncWithParens())
  
  def paramaterlessFuncWithoutParens: Int = 42
  println(paramaterlessFuncWithoutParens)


  // when you need loops, use recursion!
  // return types are not inferred for recursive functions
  def recursiveFunc(someString: String, n: Int): String = {
    if (n == 1) someString
    else someString + recursiveFunc(someString, n - 1)
  }
  println(recursiveFunc("sup", 3))

  def funcWithSideEffects(someString: String): Unit = println(someString)

  def largeFunc(n: Int): Int = {
    def smallFunc(a: Int, b: Int): Int = a + b
    
    smallFunc(n, n - 1)
  }

  def greeting(name: String, age: Int): String = {
    s"Hi, my name is $name and I am $age years old"
  }
  println(greeting("sup", 100042))
  
  def factorial(n: Int): Int = {
    if (n < 2) n 
    else n * factorial(n - 1)
  }
  println(factorial(10))
  
  def fibonacci(n: Int): Int = {
    // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
    if (n < 2) 1
    else (fibonacci(n - 1) + fibonacci(n - 2))
  }
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)
    }
    isPrimeUntil(n / 2)
  }
  println(isPrime(3))
}