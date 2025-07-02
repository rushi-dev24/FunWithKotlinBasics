@file:JvmName("Greet")

package day5.myKotlinFiles

fun main(args: Array<String>){
    greetWithDefaults()
    greetWithDefaults("Rushi")
}
@JvmOverloads
fun greetWithDefaults(name: String="Admin",role:String="User"){
    println("Hello, $name! Your role is $role.")
}