fun main(args: Array<String>) {
    println("Enter number")
    var num1 = readLine()!!.toInt()
    println("Enter second number")
    var num2 = readLine()!!.toInt()

    for (x in num1..num2 ){

        if(x % 3==0 && x % 5==0) {
            println("$x is FizzBuzz")
        } else if (x % 3==0 ){
            println("$x is Fizz")
        }else if (x % 5==0 ){
            println("$x is Buzz")
        } else{
            println(x)
        }

    }



}