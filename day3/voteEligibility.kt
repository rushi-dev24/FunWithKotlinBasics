package day3

fun main(args: Array<String>){
    val age:Int=10
    print(chechVoteEligibility(age))
}
fun chechVoteEligibility(age:Int):String{
    var result:String=if (age>=18){
        "Eligible"
    }
    else{
        "Not Eligible"
    }
    return result
}