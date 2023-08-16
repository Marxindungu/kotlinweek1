package OOP

open class Animal (color:String, legs:String, breed:String, gender:String){

    init {
         println("color is $color and it has $legs of $breed and its a $gender")
    }
}

class Dog(name:String) : Animal(color = "White", legs = "4legs", breed = "German Shepherd", gender = "male"){


    fun nameofdog(){


    }


}

fun main(args: Array<String>) {
    var dog1=Dog("Bosco")
    dog1.nameofdog()
}


