package day6

open class User(userName:String,passWord:String,role: String){
    val userName:String=userName
    private val passWord:String=passWord
    protected val role: String=role
}
class AdminUser(userName:String,passWord: String,role: String):User(userName,passWord,role){
    fun printRole(){
        println("Role: $role")
    }
}
fun main(args: Array<String>){
    var u1= AdminUser("Rushi","pass123","Admin")
    println("User Name: ${u1.userName}")
//    println("Role: ${u1.role}")
    u1.printRole()
}