fun main(args: Array<String>) {
    println("Enter your marks")

    var marks:Int = readLine()!!.toInt()

    if (marks in 10..29)
        print("Score E")

    else if (marks in 30..49)
        print("Score D")

    else if (marks in 50..69)
        print("Score D")

    else if (marks in 70..89)
        print("Score B")

    else if (marks in 90..100)
        print("Score A")

    else if (marks > 100)
        print("Score UNAVAILABLE")





}