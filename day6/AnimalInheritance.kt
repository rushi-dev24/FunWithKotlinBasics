package day6

fun main(args: Array<String>){
    var a1= Animal()
    var d1= Dog()
    a1.makeSound()
    d1.makeSound()
}
open class Animal{
    fun makeSound(){
        println("Animal sound")
    }
}
class Dog: Animal(){
}