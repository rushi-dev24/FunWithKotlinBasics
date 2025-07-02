package day5.myKotlinFiles
fun main(args: Array<String>){
    val x: Int=10
    println(x.SquareUsingExtension())
}
fun Int.SquareUsingExtension()=this*this