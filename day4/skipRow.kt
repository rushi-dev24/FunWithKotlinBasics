package day4

fun main(args: Array<String>){
    skipRowWithLabel()
}
fun skipRowWithLabel(){
    outer@ for(i in 1..3){
        for(j in 1..3){
            if(i==2){
                continue@outer
            }
            print("$j ")
        }
        println()
    }
}