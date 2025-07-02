package day5.myKotlinFiles

fun main(args: Array<String>){
    showInfo(age = 18, name = "Rushi")
}
fun showInfo(name: String, age: Int, city: String = "Hyderabad"){
    println("$name is $age years old from $city")
}