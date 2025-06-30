package day3

fun main(args: Array<String>){
    val n:Int=40
    println(tempCheck(n))
}
fun tempCheck(temp:Int):String{
    var result:String=if(temp in 0..19){
        "Cold"
    }
    else if(temp in 20..35){
        "Warm"
    }
    else if(temp>35){
        "Hot"
    }
    else{
        "Invalid choice"
    }
    return result
}