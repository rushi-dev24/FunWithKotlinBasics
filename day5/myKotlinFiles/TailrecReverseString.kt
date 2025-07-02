package day5.myKotlinFiles

fun main(args: Array<String>){
    println(reverseString("RUSHI"))
}
tailrec fun reverseString(s: String,acc: String=""): String=if(s.length==0) acc else reverseString(s.drop(1),s[0]+acc)