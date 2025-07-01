package day4

fun main(args: Array<String>){
    doWhileWithLabelBreak()
}
fun doWhileWithLabelBreak(){
    var i:Int=1
    outer@ do{
        for(j in 1..10){
            println("$i x $j = ${i*j}")
            if(i*j==20){
                break@outer
            }
        }
        i++
    }
    while (i<=10)
}