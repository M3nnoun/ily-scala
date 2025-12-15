object PascalTriangle extends App {
  def factoriel(x:Int):Int=x match {
    case 0 =>1
    case 1 =>1
    case _=> x*factoriel(x-1)
  }
  def combination(r:Int,n:Int):Int=factoriel(n)/(factoriel(r)*factoriel(n-r))

  println(combination(0,1))
  for (i <- 0 to 4){
    for(j<- 0 to i){
        print(combination(j,i)+" ")
    }
    println()
  }
}
