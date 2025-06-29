package day2

fun main(args: Array<String>){
println("${count()}")
}
fun count():Int{
    var even:Int=0
    for(i in 2..50 step 2){
        even++
    }
    return even
}