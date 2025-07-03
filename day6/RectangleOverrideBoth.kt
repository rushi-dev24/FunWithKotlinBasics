package day6

fun main(args: Array<String>){
    var s2= Shape2()
    var r1= Rectangle(4.0,5.0)
    println("Shape Area: ${s2.area()}")
    println("Rectangle area: ${r1.area()}")
}
open class Shape2 {
    open val name:String="Shape"
    open fun area(): Double{
        println("Area not defined for $name")
        return 0.0
    }
}
class Rectangle(var length:Double=0.0,var breadth: Double=0.0): Shape2(){
    override val name: String="Rectangle"
    override fun area(): Double {
        println("Area of Rectangle")
        return length*breadth
    }
}