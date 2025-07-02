package day5.myKotlinFiles

fun main(args: Array<String>){
    println(sumFromN(5))
}
tailrec fun sumFromN(n:Int,acc:Int=0):Int=
    if(n==0) acc
    else sumFromN(n-1,acc+n)