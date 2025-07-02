package day5.myKotlinFiles

fun main(args: Array<String>){
    var x:Int=5
    squareNum(x)
}
fun squareNum(n:Int){
    val result=n*n
    println("Square: $result")
}