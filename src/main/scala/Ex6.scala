object Ex6 extends App{
  
    def factoriel(x:Int):Double={
        if(x<=1) 1
        else x*factoriel(x-1)
    }

    println(factoriel(5))


def describe(value: Any): String = value match {
  case i: Int     => s"Integer: $i"
  case s: String  => s"String: $s"
  case b: Boolean => s"Boolean: $b"
  case _          => "Unknown type"
}

println(describe(10))        // Integer: 10
println(describe("hello"))   // String: hello

}
