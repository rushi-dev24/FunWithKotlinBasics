package day2

fun main(args: Array<String>){
    var object1: NameVariableInClass= NameVariableInClass()
    object1.name="Your Name"    //Assigns name to the variable in the class
    object1.display()
}
class NameVariableInClass {
    var name:String=""          //Initializes with empty string
    fun display(){
        println(name)
    }
}