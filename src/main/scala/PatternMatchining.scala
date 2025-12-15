object PatternMatchining extends App {
  // switch on steroids
  val aInt=55
  val order = aInt match{
    case 1 =>"One"
    case 2 => "Tow"
    case _ => s"$aInt th"

  }
  println(order)
}


