package day2

fun main(args:Array<String>){
    val n:Int=11
    print(isInRange(n))
}
fun isInRange(n:Int): Boolean{
    val r=1.rangeTo(10)
    if(n in r){
        return true
    }
    return false
}