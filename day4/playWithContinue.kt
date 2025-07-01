package day4

fun main(args: Array<String>){
    skipInnerTwo()
}
fun skipInnerTwo(){
    for(i in 1..3){
        for(j in 1..3){
            if(j==2){
                continue
            }
            println("Outer: $i Inner: $j")
        }
    }
}