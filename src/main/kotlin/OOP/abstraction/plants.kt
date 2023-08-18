package OOP.abstraction

abstract class plants(val name:String){

    abstract fun type()

    fun describe(){
        print("$name is a type plant")
    }
}

class tree(name: String):plants(name){
    override fun type() {

        println("$name")

    }
}

class flower(name: String):plants(name){
    override fun type () {
        println("$name")
    }
}

fun main(args: Array<String>) {

    val plant1 = tree("Palm tree")
    val plant2 = flower("Rose")

    plant1.describe()
    plant1.type()

    plant2.describe()
    plant2.type()
}

