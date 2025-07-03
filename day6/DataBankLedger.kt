package day6

import java.time.LocalDateTime

data class Account1(var id:String,var owner: String,var balance: Double){

}
data class Transaction(var from:String,var To:String,var amount: Double,var timeStamp: String){
    companion object{
        fun now():String{
            return LocalDateTime.now().toString()
        }
    }
}
object Logger{
    fun log(tx: Transaction){
        println("Logged Transaction: $tx")
    }
}
fun Account1.transfer(to: Account1,amount: Double): Transaction{
    return Transaction(this.id,to.id,amount, Transaction.now())
}

fun main() {
    val acc1 = Account1("A1001", "Rushi", 5000.0)
    val acc2 = Account1("A1002", "Mohan", 3000.0)

    val t1 = acc1.transfer(acc2, 1000.0)
    Logger.log(t1)

    val t2 = acc2.transfer(acc1, 500.0)
    Logger.log(t2)
}