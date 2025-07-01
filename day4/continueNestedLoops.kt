package day4
fun main(args: Array<String>){
    continueOuterOnCondition()
}
fun continueOuterOnCondition(){
    outer@ for(i in 1..5){
        inner@ for (j in 1..5){
            if(j==2){
                continue@outer
            }
            println("Outer: $i Inner: $j")
        }
    }
}