package day4

fun main(args: Array<String>){
    breakIfGreater()
}
fun breakIfGreater() {
    outer@ for(i in 1..5){
        for(j in 1..10){
            println("$i x $j = ${i*j}")
            if(i*j>20){
                break@outer
            }
        }
    }
}