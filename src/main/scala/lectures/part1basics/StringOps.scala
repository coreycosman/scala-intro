package lectures.part1basics

object StringOps extends App {
  val str: String = "Hello"
  println(str.charAt(2))
  println(str.substring(2, 3))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("", "-"))
  println(str.toLowerCase())
  println(str.length())

  val aNumberString = "42"
  val aNumber = aNumberString.toInt
  println(aNumber)
  // +: is prepending (prefix) and :+ is appending (suffix) note: only works with one char, not a whole string
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(5))

  // Scala specific: String Interpolators

  // S-interpolators:
  val name = "Test"
  val age = 120
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old"
  println(greeting)
  println(anotherGreeting)

  // F-interpolators:
  val speed = 1.2f
  /* note: 
    * %2.2f is printf format meaning 2 chars total (minimum) and 2 decimals precision will result in 1.20 in this example (converts to float becuase of the f interpolated formatting)
    * for formatted strings, similar to printf (print float)
    * can also check for type correctness (if the resulting type of the printf format after % is different than the type of the value, it will throw a complier error)
  */
  val myth = f"$name can eat $speed%2.2f burgers per minute" 
  println(myth)

  // raw-interpolator

  /* 
    * raw interpolated strings ignores escaped characters inside a string
    * this is not the case for injected variables
  */
  println(raw"This is a \n newline")
  val escapedAsVar = "This is a \n newline"
  println(raw"$escapedAsVar")
}