package day3

fun main(args: Array<String>){
    val x: Int=1
    println(singledigitOrNot(x))
}
fun singledigitOrNot (n:Int): Boolean{
    var result: Boolean=if(n in -9..9){
        true
    }
    else{
        false
    }
    return result
}