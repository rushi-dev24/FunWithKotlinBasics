package day5.myKotlinFiles

fun main(args: Array<String>){
    var user1: User=User("Rushi")
    user1.greet()
}

fun User.greet(){
    println("Hello, $name! Welcome.")
}
class User(val name:String){

}