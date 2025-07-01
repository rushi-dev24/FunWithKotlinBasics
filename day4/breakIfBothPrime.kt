package day4

fun main(args: Array<String>){
    breakAtPrimePair()
}
fun breakAtPrimePair(){
    outer@ for(i in 1..10){
        for(j in 1..10){
            println("$i $j")
            if(isPrime(i)&&isPrime(j)){
                break@outer
            }
        }
    }
}
fun isPrime(n:Int): Boolean{
    if(n<=1){
        return false
    }
    var f:Int=0
    for(i in 2..n-1){
        if(n%i==0){
            f++
        }
    }
    val result: Boolean=if(f==0){
        true
    }
    else{
        false
    }
    return result
}