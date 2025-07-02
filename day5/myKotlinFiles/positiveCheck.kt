package day5.myKotlinFiles

fun main(args: Array<String>){
    var x: Int=-10
    println(x.isPositive())
}
fun Int.isPositive()=this>0