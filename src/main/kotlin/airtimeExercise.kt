fun main(args: Array<String>) {
    println("Enter a digit")
    var digit = readLine()!!.toInt()
    when(digit){

        1 -> print("Airtime topup")
        2 -> print("Buy data")
        3 -> print("Use mpesa")
        5 -> print("Customer service")
        6-> print("Pay okoa")

        else -> print("Option not available")



    }


}