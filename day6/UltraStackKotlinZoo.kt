package day6

abstract class Animal4{
    abstract val name:String
    protected open val speciesType: String="Generic"
    fun info(){
        println("Animal:$name,Species: $speciesType")
    }
    companion object{
        fun animalCount():Int=2
    }
}
open class Bird(birdName:String): Animal4(), Flyable{
    override val name: String=birdName
    override val speciesType: String="Bird"
    override fun fly():String{
        return "Soars in the sky"
    }
}
open class Aquatic(): Animal4(), Swimmable{
    override var name: String=""
    override val speciesType: String="Aquatic"
    constructor(aquaName: String):this(){
        name=aquaName
    }
    override fun swim(): String{
        return "Swims in the ocean"
    }
}
object ZooInfo{
    fun welcome(){
        println("Welcome to kotlin zoo")
    }
}
class Eagle: Bird("Eagle"){

}
class Shark: Aquatic("Shark"){

}
interface Flyable{
    fun fly():String
}
interface Swimmable{
    fun swim(): String
}

fun Eagle.hunt()="Catches prey with sharp vision"

fun Shark.attack()="Attacks with deadly speed"

infix fun String.loves(other: String)="$this loves $other"

fun main(args: Array<String>){
    ZooInfo.welcome()
    var e1= Eagle()
    var s1= Shark()
    e1.info()
    println(e1.fly())
    println(e1.hunt())
    s1.info()
    println(s1.swim())
    println(s1.attack())
    println("${"Eagle" loves "Freedom"}")
    println("Total animals in zoo: ${Animal4.animalCount()}")
}