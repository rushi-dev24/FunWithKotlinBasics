package day5.myKotlinFiles

fun main(args: Array<String>){
    println(Score(88).isAbove(70))
    println(Score(880).label())
}
infix fun Score.isAbove(thresold:Int): Boolean=if(this.value>thresold) true else false
fun Score.label():String=
    if(this.value>=90) "Excellent"
    else if(this.value>=75 && this.value<90) "Good"
    else if(this.value>=50 && this.value<=74) "Average"
    else "Fail"
class Score(val value:Int){
}