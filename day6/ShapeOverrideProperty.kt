package day6

fun main(args: Array<String>){
    var s1= Shape()
    var s2= Circle()
    println("Shape name: ${s1.name}")
    println("Circle name: ${s2.name}")

}
open class Shape{
    open val name: String="Shape"

}
class Circle: Shape(){
    override val name:String="Circle"
}