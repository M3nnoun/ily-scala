error id: file:///C:/Users/ThinkPad/Documents/scala-insea/hello-world/src/main/scala/Main.scala:`<none>`.
file:///C:/Users/ThinkPad/Documents/scala-insea/hello-world/src/main/scala/Main.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -x/ceil/toInt.
	 -x/ceil/toInt#
	 -x/ceil/toInt().
	 -scala/Predef.x.ceil.toInt.
	 -scala/Predef.x.ceil.toInt#
	 -scala/Predef.x.ceil.toInt().
offset: 1316
uri: file:///C:/Users/ThinkPad/Documents/scala-insea/hello-world/src/main/scala/Main.scala
text:
```scala
object Main extends App {
///  exerice 2
val premiers=List()

def is_premary(x:Int,m:Int):Boolean = {
    if m== 1 then true
    else if x%m==0 then false
    else is_premary(x,m-1)
}

for(i<-(2 to 100)){
    if (is_premary(i, i-1)) {
        println(i)
    }
}

//2

for(i<-Range(2,10,2).toList){
    if (i%2==0) println(i)
}

//exercise 3
println("<=== exercise 3 ===>")
def f1(x:Int,y:Int)= (x+y)%2 match{
    case 0=> println(s"les deux nombres sont paires et la Some: "+ (x+y))
    case 1=> println(s"les deux nombres sont unpaires et produit:"+ (x*y))
}
f1(23,20)
///Exercice 5

println("<=== exercise 5 ===>")

def is_positive(x:Int)=x>=0

def f2(arr:Array[Int])={
    for(elm<-arr){
        elm>=0 match {
            case false=> println("le nomber est negative")
            case true=> println("le nomber est possitive")
        }
    }
}

f2(Array(12,34,3,-45))

///Exercice 6
println("<=== exercise 6 ===>")
def f3(x:Int)={
    def fInbrq()=println("Nothing")
    
    var reslt=1
    x match {
    case 1=> 1
    case _ => for(i<-(2 to x)){
                reslt*1
                reslt
                }
    }

}

f3(6)
  
// Exercise 7
println("<=== exercise 7 ===>")

def apply1(x:Double)=x.round.toInt
def apply2(x:Double)=x.ceil.@@toInt

println(apply1(2.3)+" || "+apply2(3.9))



}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.