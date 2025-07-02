package day5.myKotlinFiles

fun main(args: Array<String>){
    greetUser()
    greetUser("Rushi")
}
fun greetUser(name:String="Unknown"){
    println("Hello, ${name}!")
}