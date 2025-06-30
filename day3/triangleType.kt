package day3

fun main(args: Array<String>){
    val a:Int=3
    val b: Int=4
    val c: Int=5
    println(triangleType(a,b,c))
}
fun triangleType(a: Int, b: Int, c: Int): String{
    val result: String=if(a==b&&a==c) {
        "Equilateral"
    }
    else if(a==b||a==c||b==c){
            "Isosceles"
    }
    else{
            "Scalene"
    }
    return result
}