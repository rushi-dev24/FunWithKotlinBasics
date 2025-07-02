package day5.myKotlinFiles

fun main(args: Array<String>){
    println(min(b=3,a=2))
    println(max(b=5,a=10))
}
fun min(a:Int,b: Int):Int=if(a<b) a else b
fun max(a:Int,b:Int):Int=if(a>b) a else b