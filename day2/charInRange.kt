package day2

fun main(args: Array<String>){
    val ch: Char='a'
    print(isInRange(ch))
}
fun isInRange(ch: Char): Boolean{
    if(ch in 'a'..'z'||ch in 'A'..'Z'){
        return true
    }
    return false
}