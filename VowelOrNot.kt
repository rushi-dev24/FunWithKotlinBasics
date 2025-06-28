fun main(args: Array<String>){
val ch: Char='a'
    if(VowelOrNot(ch)){
        println("Vowel")
    }
    else{
        println("Not a Vowel")
    }
}

fun VowelOrNot(c: Char): Boolean{
    val vowels: Array<Char>
    vowels=arrayOf('a','e','i','o','u')
    for(k in vowels){
        if(k == c){
            return true
        }
    }
    return false
}