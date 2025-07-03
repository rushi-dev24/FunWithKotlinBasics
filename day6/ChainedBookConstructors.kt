package day6

fun main(args: Array<String>){
    var b1= Book2("A","B",2000)
}
class Book2(title:String){
    init{
        println("Title: $title")
    }
    constructor(title: String,Author: String):this(title){
        println("Author: $Author")
    }
    constructor(title: String,Author: String,Year: Int):this(title,Author){
        println("Year: $Year")
    }
}