package day5.myKotlinFiles

fun main(args: Array<String>){
    val s: String="My name is jack"
    println("${s.toDashCase()}")
}
fun String.toDashCase()=this.replace(" ","-")