package lectures.part1basics

object Recursion extends App {
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println(s"computing factorial of $n first need factiorial of  ${n - 1}")
      val res = n * factorial(n - 1)
      println(s"computed factorial of $n")
      res
    }
  }
  // println(factorial(10))

  // TAIL RECURSION (recursive call as last expression on each code path that is occurs), uses intermediate variable to store values eg accumulator. Doesnt require new stack frame for each call
  def anotherFactorial(n: Int): BigInt = {
    def factHelper(n: Int, acc: Int): Int = {
      if (n <= 1) acc
      else factHelper(n - 1, n * acc)
    }

    factHelper(n, 1)
  }
  /* anotherFactorial(10) = factHelper(10, 1)
    = factHelper(9, 10 * 1)
    = factHelper(8, 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
    = factHelper(6, 7 * 8 * 9 * 10 * 1)
    = factHelper(5, 6 * 7* 8 * 9 * 10 * 1)
    = factHelper(4, 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = factHelper(3, 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    = factHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
    return acc
  */ 

  // WHEN YOU NEED LOOPS, USE TAIL RECURSION

  def tailRecursiveConcat(someString: String, n: Int, acc: String): String = {
    if (n <= 0) acc
    else tailRecursiveConcat(someString, n - 1, someString + acc)
  }
  println(tailRecursiveConcat("hello", 3, ""))

  def tailRecursiveIsPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeUntil(t - 1, n % t != 0 && isStillPrime)
    }
    isPrimeUntil(n / 2, true)
  }
  println(tailRecursiveIsPrime(2003))
  println(tailRecursiveIsPrime(629))
  
  def tailRecursiveFibonacci(n: Int): Int = {
    def fibonacciHelper(i: Int, last: Int, nextToLast: Int): Int = {
      if (i >= n) last
      else fibonacciHelper(i + 1, last + nextToLast, last)
    }

    if (n <= 2) 1
    else fibonacciHelper(2, 1, 1)

    /*
      = fibonacciHelper(3, 1, 1)
      = fibonacciHelper(4, 2, 1)
      = fibonacciHelper(5, 3, 2)
      = fibonacciHelper(6, 5, 3)
      = fibonacciHelper(7, 8, 5)
      = fibonacciHelper(8, 13, 8)
      = fibonacciHelper(9, 21, 13)
      = fibonacciHelper(10, 34, 21)
      = fibonacciHelper(11, 55, 34)
    */
  }
  println(tailRecursiveFibonacci(8))
}