package day5.myKotlinFiles

fun main(args: Array<String>){
    var x:Int=11
    isEven(x)
}
fun isEven(n:Int): Unit {
    var result= n%2==0
    println(result)
}