package kotlinChallenge

fun main(args: Array<String>) {
    println("Enter any sentence or word with letter e")
    val word = readLine() ?:""
    var counter = 0
    for (c in word) {
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







