package day4

fun main(args: Array<String>){
    breakFromNestedLoops()
}
fun breakFromNestedLoops(){
    outer@ for(i in 1..5){
        inner@ for(j in 1..5){
            println("Outer: $i Inner: $j")
            if(j==2){
                break@outer
            }
        }
    }
}