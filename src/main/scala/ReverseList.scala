object ReverseList extends App {

def f(arr:List[Int]):List[Int] = {
    if(arr.size==0) List()
    else f(arr.tail) :+arr.head
}


  println(f(io.Source.stdin.getLines.toList.map(_.trim).map(_.toInt)).mkString("\n"))
}