package day5.myKotlinFiles

fun main(args: Array<String>){
    countdown(10)
}
tailrec fun countdown(n:Int){
    if(n==0) return
    println(n)
    countdown(n-1)
//    if(n==1){
//        println(n)
//    }
//    else{
//        println(n)
//        countdown(n-1)
//    }
}