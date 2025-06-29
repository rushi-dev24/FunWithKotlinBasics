package day2

fun main(args: Array<String>){
    val personObj=PersonInfo("Rushi")
    personObj.display()
}

class PersonInfo(val name:String){
    fun display(){
        println(name)
    }
}