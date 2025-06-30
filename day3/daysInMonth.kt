package day3

fun main(args: Array<String>){
    val m:Int=10
    println(daysInMonth(m))
}

fun daysInMonth(month:Int):Int{
    var result:Int=when(month){
        1,3,5,7,8,10,12->31
        4,6,9,11->30
        2->28
        else->-1
    }
    return result
}