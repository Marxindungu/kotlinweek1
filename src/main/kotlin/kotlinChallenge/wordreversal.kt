package kotlinChallenge

fun main(args: Array<String>) {
    println("Enter a word to see it in reverse order ")
    var word = readLine()!!.toString()
    println("$word in reverse is")

    var string = word.reversed()
    print(string)

}