package day6

fun main(args: Array<String>){
    var p1= Employee()
    var p2= Employee("Rushi")
    var p3= Employee("Rushi",100000)
}

class Employee(name: String="Unknown",salary:Int=0){
    init{
        println("Name: $name, Age: $salary")
    }
}