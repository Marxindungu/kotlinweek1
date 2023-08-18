package kotlinChallenge

fun main(args: Array<String>) {
    println("Enter the year")
    var year = readLine()!!.toInt()

    if (year % 4 ==0)
        print("$year is a leap year")
    else
        print("$year is not a leap year")


}