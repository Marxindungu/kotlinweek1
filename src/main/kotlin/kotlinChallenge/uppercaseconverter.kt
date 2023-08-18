package kotlinChallenge

fun main(args: Array<String>) {
    println("Enter a word")
    var word = readLine()!!.toString()

    if (word.isBlank()) {
        println("Enter a letter")
    } else {

        var word = word.toUpperCase()
        println("$word")

    }
}


