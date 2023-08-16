package kotlinChallenge

fun main(args: Array<String>) {
    println("Enter any word with letter e")
    val letter = readLine()!!.toString()
    var counter = 0
    for (c in letter) {
        if (c == 'e') {
            counter++
        }
    }


    var results = counter++
    println(results)
    assertEquals(2, counter)

}

fun assertEquals(i:Int, counter: Int) {



}
