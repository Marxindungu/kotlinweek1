fun main(args: Array<String>) {
    val num2 = 56
    printSum(77, num2 = 56 )
}
fun printSum(num1: Int, num2: Int){
    val sum = sumNumbers(num1, num2)
    print(sum)
}

fun sumNumbers(num1 :Int, num2:Int):Int {
    return num1+num2
}
