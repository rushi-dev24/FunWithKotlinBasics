package day6

fun main(args: Array<String>){
    var s1= Shape1()
    var c1= Circle1()
    println("Shape area: ${s1.area()}")
    println("Circle area: ${c1.area()}")
}
open class Shape1{
    open fun area(): Double{
        println("Calculating area for shape")
        return 0.0
    }
}
class Circle1: Shape1(){
    override fun area(): Double{
       println("Calculating area for Circle")
        return 3.14*5.0*5.0
    }
}