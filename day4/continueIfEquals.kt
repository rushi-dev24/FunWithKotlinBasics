package day4

fun main(args: Array<String>){
    continueIfEquals()
}
fun continueIfEquals() {
    outer@ for(i in 1..5){
        for(j in 1..5){
            if(i==j){
                continue@outer
            }
            println("$i $j")
        }
    }
}