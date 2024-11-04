fun main(){
    println(parseDigit('8'))
}


// '0' has ASCII code 48 1 has 49 and so on
// and when you subtract 1 - 0 it is 49 -48 you get 1 as output, essentially ASCII does not have integers but integers as chars.
fun parseDigit(char: Char): Int{

    return if(char in '0'..'9'){
        char - '0'
    }
    else{
        -1
    }
}
