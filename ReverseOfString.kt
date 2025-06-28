fun main(args: Array<String>){
    val s:String="Rushi"
    println("${Reverse(s)}")
}
fun Reverse(s:String): String{
    var result:String
    result=s
    return result.reversed()
}