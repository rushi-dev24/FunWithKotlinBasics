fun main(args: Array<String>){
    val n:Int=4
    println(Factorial(n))
}
fun Factorial(n:Int):Int{
    var i:Int=n
    var result:Int=1
    while(i>0){
        result=result*i
        i=i-1
    }
    return result
}