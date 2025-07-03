package day6

fun main(args: Array<String>){
    var c1= Car("A","B")
}
open class Vehicle(brand: String) {
    init{
        println("Brand: $brand")
    }
}
class Car(brand: String,model:String): Vehicle(brand){
    init{
        println("Model: $model")
    }
}
