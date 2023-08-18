package OOP.abstraction

abstract class seacreatures(val name:String){

    abstract fun makesound()

    fun describe(){
        print("$name is a seacreature")
    }
}

class fish(name: String):seacreatures(name){
    override fun makesound() {
        println("$name makes a blup sound")
    }
}

class whale(name: String):seacreatures(name){
    override fun makesound() {
        println("$name has a deep under water voice")
    }
}

fun main(args: Array<String>) {

    val creature1:seacreatures = fish("nemo")
    val creature2:seacreatures = whale("Octavia")

    creature1.describe()
    creature1.makesound()

    creature2.describe()
    creature2.makesound()
}