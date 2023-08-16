package kotlinChallenge

fun main(args: Array<String>) {

    println("Enter your name")
    var name = readLine()!!.toString()

    if(name. isBlank()){
        println("Please enter your name")
    } else {
        print("Hello $name")
    }

}
