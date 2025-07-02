package day5.myKotlinFiles

fun main(args: Array<String>){
    calculateRectangleArea(width = 10, length = 20)
}
fun calculateRectangleArea(length:Int,width:Int){
    println("Area of rectangle: ${length*width}")
}