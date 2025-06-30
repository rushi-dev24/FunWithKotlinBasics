package day3

fun main(args: Array<String>){
    val marks:Int=78
    println(examResult(marks))
}
fun examResult(marks:Int): String{
         var result: String=when(marks){
             in 100 downTo 75->"Distinction"
             in 74 downTo 35->"Pass"
             else->"Fail"
         }
    return result
}