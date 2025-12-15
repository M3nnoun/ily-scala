import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object EvaluatingEx {
    def power(x:Double,y:Int):Double=if (y==0) 1 else x * power(x,y-1)

    def fact(x:Double):Double=if(x<=1) 1 else x*fact(x-1)

    def expo(x:Double,y:Int):Double=if (y==0) 1 else power(x,y)/fact(y) + expo(x,y-1)


    def main(args: Array[String]):Unit = {
        val stdin = scala.io.StdIn
        
        val n = stdin.readLine.trim.toInt

        for (nItr <- 1 to n) {
            val x = stdin.readLine.trim.toDouble
            println(expo(x,9))
        }
    }
}
