package day5.myKotlinFiles

fun main(args: Array<String>){
    println(hasSameFirstAndLastDigit(121))
}
fun hasSameFirstAndLastDigit(n:Int): Boolean{
    var i:Int=n
    val x: Int=i%10
    var y: Int=-1
    outer@ while(i>0){
        if(i<10) {
            y=i
            break@outer
        }
        i=i/10
    }
    return x==y
}