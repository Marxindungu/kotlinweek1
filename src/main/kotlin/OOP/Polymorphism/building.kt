package OOP.Polymorphism

open class Building (val type: String){
    open fun openDoor(){
        println("$type is opening")
    }
}

class House(type: String) : Building(type){
    override fun openDoor(){
        println("$type house door is opening")
    }
}





class Apartments(type: String):Building(type){
    override fun openDoor(){
        println("$type apartment door is open")
    }
}

fun main(args: Array<String>) {
    var building1: Building = House("Bungalo")
    building1.openDoor()

    var building2: Building = Apartments("Studio")
    building2.openDoor()

    var building3: Building =Compatment ("Skyscraper")
    building3.openDoor()




}


class Compatment  (type: String):Building(type){
    override fun openDoor(){
        println("$type compatment door is open")
    }
}