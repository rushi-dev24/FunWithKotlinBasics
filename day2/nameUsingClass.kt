package day2

fun main(args: Array<String>){
    val name: String="Rushi"
    var PersonObj:Person=Person()
    PersonObj.display(name)
}

class Person{
    fun display(name: String){
        print(name)
    }
}