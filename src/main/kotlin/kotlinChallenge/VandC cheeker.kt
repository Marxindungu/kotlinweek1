package kotlinChallenge

fun main(args: Array<String>) {
    println("Enter a letter")
    var letter = readLine()!!.toString().trim()

    if (letter.isBlank()) {
        println("Enter a letter")
    } else {

        var chara = letter[0].toLowerCase()

        var result = if (chara in "aeiou") {

            println("is a vowel")

        } else {
            println("Consonant")
        }
    }
}






