package day6

fun main(args: Array<String>){
    var s1= Student("Rushi",85)
}
class Student(var name: String,var marks: Int){
    init{
        println("Name: $name")
        println("Status: ${if(marks<35) "Fail" else "Pass"}")
    }
}