object Gcd extends App {
     def gcd(a:Int,b:Int):Int=(a%b) match {
        case 0 => b
        case _ => gcd(b,a%b)
     }


     print(gcd(2240,615))
}
