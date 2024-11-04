// Convert a string representing a number into its corresponding integer. If the string cannot be converted, return -1.

fun main(){
    println(parseInt(""))
}


fun parseInt(num: String): Int{
    if (num.isEmpty()) return 0

    var isNegative = false
    var startIndex = 0
    var result = 0

    //Check for Negative number
    if(num[0] == '-') {
        isNegative = true
        startIndex = 1
    }

    for( i in startIndex until num.length){
        val char =num[i]
        if(char !in '0'..'9') return -1
        result = result * 10 + (char - '0')
    }
    return if (isNegative) -result else result
}
