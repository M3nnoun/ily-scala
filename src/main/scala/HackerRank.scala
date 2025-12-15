object HackerRank extends App {
  def f(x: Int): Double = if (x == 0) 1 else 1

  def power(x: Double, y: Int): Double = if (y == 0) 1 else x * power(x, y - 1)

  def fact(x: Double): Double = if (x <= 1) 1 else x * fact(x - 1)

  def expo(x: Double, y: Int): Double =
    if (y == 0) 1 else power(x, y) / fact(y) + expo(x, y - 1)

  println(expo(20, 9))
//   val start:Int=0

//   while(start<10){

//   }

  val stdin = scala.io.StdIn

  val n = stdin.readLine.trim.toInt

  for (nItr <- 1 to n) {
    val x = stdin.readLine.trim.toDouble
    println(expo(x, 9))
  }

  
}
