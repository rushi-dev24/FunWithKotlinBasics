package day5.myKotlinFiles

import kotlin.math.sqrt

fun main(args: Array<String>){
    outer@ for(i in 1..1000){
        if(i%7==0 && i%4==0 && i.toDouble().isPerfectSquare()){
            println("$i")
            break@outer
        }
    }
}
fun Double.isPerfectSquare(): Boolean{
    var value: Int=sqrt(this).toInt()
    if(value*value==this.toInt()) return true
    return false
}
