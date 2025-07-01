package day4

fun main(args: Array<String>){
    labelledLoopSimple()
}

fun labelledLoopSimple(){
    outer@ for(i in 1..5){
        println(i)
    }
}