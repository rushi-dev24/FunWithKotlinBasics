package day3

fun main(args: Array<String>){
    val c: Char='k'
    println(charInRange(c))
}
fun charInRange(c: Char): Boolean {
    var result: Boolean=if(c in 'k'..'z'||c in 'A'..'Z')
        true
    else
        false
    return result
}