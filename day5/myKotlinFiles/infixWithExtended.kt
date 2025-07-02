package day5.myKotlinFiles

fun main(args: Array<String>){
    var x:Int=13
    var y: Int=12
    println(x IncreaseBy y)
}
infix fun Int.IncreaseBy(num:Int):Int{
    return this+num
}