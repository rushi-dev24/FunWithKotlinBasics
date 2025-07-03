package day6

abstract class Animal3{
    abstract fun speak(): String
    fun describe(){
        println("This is an animal")
    }
}
class Dog1: Animal3(){
    override fun speak(): String="Woof"
}
class Cat: Animal3(){
    override fun speak(): String="Meow"
}
fun main(args: Array<String>){
    var c1= Cat()
    var d1= Dog1()
    println(d1.speak())
    d1.describe()
    println(c1.speak())
    c1.describe()
}