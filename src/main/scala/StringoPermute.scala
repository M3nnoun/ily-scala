import scala.io.StdIn
object StringoPermute {
def main(args: Array[String]) ={
        val ns=scala.io.StdIn.readLine().trim.toInt
        for (i<- 1 to ns){
            val s = scala.io.StdIn.readLine()
            val pairs=s.grouped(2).toList
            val result = pairs.flatMap(x=>x(1) +""+ x(0)).mkString
            println(result)
        }
    }
}


