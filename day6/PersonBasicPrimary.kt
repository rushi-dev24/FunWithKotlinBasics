package day6

fun main(args: Array<String>){
    var p1= Person("Rushi",18)
}
class Person(name:String,age:Int){
    init{
        println("Name: $name, Age: $age")
    }
}