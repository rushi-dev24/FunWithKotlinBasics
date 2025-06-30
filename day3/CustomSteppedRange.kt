package day3

fun main(args: Array<String>){
    customSteppedRange()
}
fun customSteppedRange() {
    for(i in 10..100 step 15){
        println("$i ")
    }
}