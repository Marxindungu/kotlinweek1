package OOP

class House(location:String, owner:String, rent:Int) {
    init {
        println(" $location $owner $rent")
    }
}

fun main(args: Array<String>) {
    var room = House("Huruma", "Francis", 1500)

}