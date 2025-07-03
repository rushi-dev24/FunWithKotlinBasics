package day6

fun main(args: Array<String>){
    Employee1("Rushi",20,100000)
}
open class Person1(name: String,age:Int){
    init{
        println("Person: $name, Age: $age")
    }
}
class Employee1(name: String,age: Int,salary:Int): Person1(name,age){
    init{
        println("Employee salary: $salary")
    }
}