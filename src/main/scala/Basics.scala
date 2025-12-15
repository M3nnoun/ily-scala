object Basics extends App {
//  define a value
val x:Int=43;
println(x);

val aBoolean=false;

val myName="Abdelfatah";

val age=25;

val greetingg="Hello, my name is "+myName+" and I am "+age+" years old.";

val greetingg2=s"Hello , my name is $myName and I am $age years old.";

if aBoolean then println(greetingg2) else println(greetingg);

println("--------------------")
val anExpression=2+3*4;
println(anExpression);

val ifExpression=if aBoolean then 56 else 78;
println(ifExpression);

println("-------- code blocks ---------")
val codeBlock={
  val y=2;
  val z=3;
  y+z
};
println(codeBlock);

// define a function
def myFunction(x:Int):Int=x+1;
println(myFunction(5));

// make a factorial function
def factorial(n:Int):Int = if (n<=1) 1 else n*factorial(n-1);
println(factorial(5));

def someJsq(n:Int):Int = {
    if (n==0) 0 
    else{
        if (n>0) n+someJsq(n-1) else n+someJsq(n+1)
    }
    };
println(someJsq(-3));
}
