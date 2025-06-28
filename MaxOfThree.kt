import kotlin.math.max

fun main(args: Array<String>){
    val a:Int
    val b: Int
    val c: Int
    a=10
    b=20
    c=15
    println(Max(a,b,c))
}
fun Max(a:Int,b: Int,c: Int):Int{
    val x: Int
    val result: Int
    x=max(a,b)
    result=max(x,c)
    return result
}
