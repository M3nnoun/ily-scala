object FunctionalPrograming extends App {

  class Person(name: String) {
    def greet(): Unit = println(s"Hi, my name is $name.")

    def apply(age: Int) = print(s"My name is $name and I am $age years old.")
  }
  val john = new Person("John")
  john.greet()
  john(45)

  //   Function X = Function1, Function2, .... Function22
  val simpleIncrementer = new Function1[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }

  val simpleDecrementer = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 - 1
  }

  println()
  println(simpleIncrementer(33))

  println(simpleDecrementer(22))

  // ## useing short hand notion
  val power2: Function1[Int, Int] = (x: Int) => x * x
  println(power2(4))

  //  for expersion
  val alter = for {
    x <- List(1, 2, 3) letter <- List('a', 'b', 'c')
  } yield s"$x - $letter"
println(alter)


}
