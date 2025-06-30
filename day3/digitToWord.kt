package day3

fun main(args: Array<String>){
    val ch: Char='0'
    println(digitOfWord(ch))
}
fun digitOfWord(ch: Char): String{
    val result: String=when(ch){
        '0'->"Zero"
        '1'->"One"
        '2'->"Two"
        '3'->"Three"
        '4'->"Four"
        '5'->"Five"
        '6'->"Six"
        '7'->"Seven"
        '8'->"Eight"
        '9'->"Nine"
        else->"Invalid Input"
    }
    return result
}