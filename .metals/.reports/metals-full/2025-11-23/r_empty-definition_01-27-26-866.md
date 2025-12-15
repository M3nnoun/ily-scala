error id: file:///C:/Users/ThinkPad/Documents/scala-insea/hello-world/src/main/scala/ObjectOrientation.scala:`<none>`.
file:///C:/Users/ThinkPad/Documents/scala-insea/hello-world/src/main/scala/ObjectOrientation.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -println.
	 -println#
	 -println().
	 -scala/Predef.println.
	 -scala/Predef.println#
	 -scala/Predef.println().
offset: 286
uri: file:///C:/Users/ThinkPad/Documents/scala-insea/hello-world/src/main/scala/ObjectOrientation.scala
text:
```scala
object ObjectOrientation extends App {
  class Animal{
    var age=0;
    def eat()=println("I am eating");
  }

  val anAnimal = new Animal

  //   inheritance
  class Dog(name:String) extends Animal{
    val n:String=name
    override def eat(): Unit =  {
      super.eat()
      prin@@tln("Dog is eating")
    }
  }
  val aDog = new Dog("Lassie")
  aDog.age=8
  println(aDog.age)
  aDog.eat()
  println(aDog.n)

  class cat(val catName:String){
    def meow()=println(s"$catName says Meowww")
  }
  val aCat = new cat("Whiskers")
  aCat.meow()

  // abstact class
  abstract class WalkingAnimal{
    val hasLegs = true
    def walk():Unit
  }

  class Human(name:String) extends WalkingAnimal{
    override def walk(): Unit = println(s"$name is walking")
  }
  val aHuman = new Human("John")
  aHuman.walk()


  // trait
  trait Carnivore{
    def eat(animal:Animal):Unit
  }

  trait ColdBlooded{
    def regulateBodyTemperature():Unit
  }
  class tiger extends Animal with Carnivore with ColdBlooded{
    override def eat(animal: Animal): Unit = println("Tiger is eating yaumy: "+animal)
    override def regulateBodyTemperature(): Unit = println("Regulating body temperature")
  }
  val aTiger = new tiger
  aTiger.eat(aDog)
  aTiger.regulateBodyTemperature()


  // annomymous class 
  val mohamed = new Carnivore{
    def eat(animal: Animal): Unit = println("I am mohamed I can eat evrythings")
  }
  mohamed.eat(animal = aTiger )

  // generics type
  

  
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.