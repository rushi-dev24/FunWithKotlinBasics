package day5.myKotlinFiles

fun main(args: Array<String>){
    printDetails()
    printDetails("Rushi")
    printDetails("Rushi",18)
}
@JvmOverloads
fun printDetails(name:String="Unknown",age:Int=0,country:String="India"){
    println("Name: $name, Age: $age, Country: $country")
}