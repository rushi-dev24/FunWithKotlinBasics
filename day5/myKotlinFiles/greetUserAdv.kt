package day5.myKotlinFiles

fun main(args: Array<String>){
    greetUserAdv("Rushi",18)
    greetUserAdv("Rushi")
    greetUserAdv()
}
fun greetUserAdv(name: String="User",age:Int=0){
    println("Hello, $name! You are $age years old.")
}