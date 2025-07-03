package day6

import java.time.LocalDateTime

data class Wallet(val walletId:String,val holder:String,val balance:Double)
data class TransactionLog(val from:String,val to:String,val amount: Double,val timeStamp:String){
    companion object{
        fun now(): String{
            return LocalDateTime.now().toString()
        }
    }
}
object AuditLogger{
    fun log(tx: TransactionLog){
        println("$tx")
    }
}
fun Wallet.sendMoney(to: Wallet,amount: Double): TransactionLog{
    return TransactionLog(this.walletId,to.walletId,amount, TransactionLog.now())
}
fun main(args: Array<String>){
    var w1= Wallet("W1","H1",25000.0)
    var w2= Wallet("W2","H2",30000.0)

    var t1=w1.sendMoney(w2,10000.0)
    AuditLogger.log(t1)
}