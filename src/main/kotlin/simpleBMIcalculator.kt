fun main(args: Array<String>) {

    println("Enter your Height in feet")
    var num1:Float = readLine()!!.toFloat()
    println("Enter your Weight in kilograms")
    var num2:Float = readLine()!!.toFloat()


    var result = num1 / ( num2 * num2)


    print(result)



}