package day5.myKotlinFiles

fun main(args: Array<String>){
    println(3 isGreaterThan 5)
}
infix fun Int.isGreaterThan(other:Int):String=if(this>other) "Greater" else if(this<other) "less" else "Equal"