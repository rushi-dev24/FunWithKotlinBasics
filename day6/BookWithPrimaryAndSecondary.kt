package day6

fun main(args: Array<String>){
    var b1=Book("Book","Author")
}
class Book1(title: String){
    init{
        println("Title: $title")
    }
    constructor(title: String,author: String):this(title){
        println("Author: $author")
    }
}