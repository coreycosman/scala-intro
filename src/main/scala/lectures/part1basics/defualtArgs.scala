package lectrues.part1basics

object DefaultArgs extends App {
  def tailRecursiveFactorial(n: Int, acc: Int = 1): Int = 
    if (n <=1) acc
    else tailRecursiveFactorial(n-1, n*acc)
  
  /* accumulator starts with 1 everytime */
  val fact10 = tailRecursiveFactorial(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")

  /* can name the args to pass in */
  savePicture(width = 100)
  /* can pass in named args in any order */
  savePicture(width = 100, format = "test", height = 42)
}