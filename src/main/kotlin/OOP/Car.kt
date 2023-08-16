package OOP

class Car(make:String, model:String, price:Int) {
    init {
        println("$make $model $price")


    }
}

fun main(args: Array<String>) {
    var owner1 = Car("Mazda", "CX-5", 700000)
    var owner2 = Car("Nissan", "Note", 750000)
    var owner3 = Car("Toyota", "Premio", 1300000)
}