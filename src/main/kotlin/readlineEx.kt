fun main(args: Array<String>) {
    println("Enter your Age")

    var myage:Int = readln()!!.toInt()

    if (myage >=21){
        print("welcome homie")
    }else
        print(" Sorry under the age limit")
}