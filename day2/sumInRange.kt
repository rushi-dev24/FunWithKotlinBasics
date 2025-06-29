package day2

fun main(args: Array<String>){
    val start: Int=2
    val end: Int=6
    sum(start,end)
}
fun sum(start:Int,end: Int){
    val r=start..end
    var sum=0
    for(i in r){
        sum+=i
    }
    println(sum)
}