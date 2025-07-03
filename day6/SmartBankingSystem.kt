package day6

abstract class BankUser{
    abstract val userType: String
    protected val accessLevel:String="Normal"
    fun showAccess(){
        println("UserType: ${userType} AccessLevel: ${accessLevel}")
    }
    companion object {
        fun systemUsersCount():Int=2
    }
}

data class Account(val number: String,val balance:Double)

interface Transactional{
    fun performTransaction(amount:Double):String
}

interface Reportable{
    fun generateReport():String
}
class Admin: BankUser(), Transactional, Reportable{
    override val userType: String="Admin"
    override fun performTransaction(amount: Double): String ="$userType performed transaction of $amount"
    override fun generateReport(): String ="$userType report generated"
    companion object{
        fun adminTools(){
            println("Accessing admin tools")
        }
    }
}
class Customer(name:String): BankUser(), Transactional{
    override val userType: String="Customer"
    override fun performTransaction(amount: Double): String="$userType performed transaction of $amount"
    var account: Account
    init {
        account= Account("Unknown", 0.0)
    }
    constructor(name:String,balance:Double):this(name){
        account= Account(name,balance)
    }
}
object SystemUtils{
    fun printBanner(){
        println("Welcome to smart kotlin banking System")
    }
}
fun Account.summary(){
    println("Account $number has balance $balance")
}
infix fun String.connectTo(other:String):String=this+other
fun main() {
    SystemUtils.printBanner()

    val admin = Admin()
    admin.showAccess()
    println(admin.performTransaction(1000.0))
    println(admin.generateReport())
    Admin.adminTools()

    val customer = Customer("Rushi", 5000.0)
    customer.showAccess()
    println(customer.performTransaction(1200.0))

    val acc = Account("A12345", 7500.0)
    println(acc.summary())

    println("Customer" connectTo "Support")

    println("System Users: ${BankUser.systemUsersCount()}")
}
