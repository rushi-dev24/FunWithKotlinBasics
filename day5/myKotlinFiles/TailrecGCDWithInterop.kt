@file:JvmName("MathUtil")
package day5.myKotlinFiles

fun main(args: Array<String>){
    println(gcd(0,30))
}
tailrec fun gcd(a:Int,b: Int):Int=if(b==0) a else gcd(b,a%b)