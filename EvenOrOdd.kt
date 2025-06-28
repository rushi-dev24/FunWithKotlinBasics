fun main(args: Array<String>){
    val n: Int
    n=11
    if(EvenOrOdd(n)){
        println("Even")
    }
    else{
        println("Odd")
    }
}
fun EvenOrOdd(n:Int): Boolean{
    val bool: Boolean
    if (n%2==0){
        bool=true
    }
    else{
        bool=false
    }
    return bool
}