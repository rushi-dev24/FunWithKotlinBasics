package day5.myKotlinFiles

fun main(args: Array<String>){
    println(4.factorial())
}
tailrec fun Int.factorial(acc:Int=1):Int=if(this==0) acc else (this-1).factorial(acc*this)