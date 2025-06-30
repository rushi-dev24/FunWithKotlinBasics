package day3

fun main(args: Array<String>){
    val x:Int=20
    val y:Int=15
    println(comparision(x,y))
}
fun comparision(a:Int,b:Int):String{
    var result: String=if(a==b)
        "Equal"
    else if(a>b)
        "$a is greater"
    else
        "$b is greater"
    return result
}