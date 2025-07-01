package day4

fun main(args: Array<String>){
    breakOnSumEqualsTen()
}
fun breakOnSumEqualsTen(){
    var sum:Int=0
    outer@ for(i in 1..5){
        inner@ for(j in 1..5){
            println(" $i + $j = ${i+j} ")
            if(i+j==10){
                break@outer
            }
        }
    }
}