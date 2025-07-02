package day5.myKotlinFiles

fun main(args: Array<String>){
    println(isParlindrome("MADAM"))
}
tailrec fun isParlindrome(input: String,start:Int=0,end:Int=input.length-1): Boolean=
    if(start>end) true
    else if (input[start]==input[end]) isParlindrome(input,start+1,end-1)
    else false