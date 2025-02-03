
package lectures.part2basicsoop

object OOPBasics extends App {
  val person = new Person("name", 1)
  println(person.age)
  println(person.greet())
  println(person.greet("sup"))
}

// adding val to constructor params adds it as a class member
class Person(val name: String, val age: Int) {
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name");
  // overloading (defining multiple implemetations of a method under the same name, with different signatures (parameter lists))
  // cannot overload with different implementations using the same parameter list
  def greet(): Unit = println(s"Hi, I am $name");

  // multiple constructors (only used in practice for default parameters)

  // auxillary constructors: must return a constructor of the same class
  def this(name:  String) = this(name, 0)
}