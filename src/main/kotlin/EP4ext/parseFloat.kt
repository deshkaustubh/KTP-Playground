package org.example.EP4ext

fun main(){
    val (parsedFloat, decimalCount) = parseFloat("-1.5632")
    println(String.format("%.${decimalCount}f", parsedFloat))
}


fun parseFloat(num: String): Pair<Float, Int>{
    if (num.isEmpty()) return Pair(0f,0)

    var isNegative = false
    var startIndex = 0
    var result = 0f
    var decimalPresent = false
    var divisor = 1f
    var decimalCount = 0
    //Check for Negative number
    if(num[0] == '-') {
        isNegative = true
        startIndex = 1
    }

    for( i in startIndex until num.length){
        val char =num[i]
        if(char !in '0'..'9' && char != '.') return Pair(-1f, 0)

        if(char =='.'){
            decimalPresent = true
            continue
        }
        if(decimalPresent){
            //var divisor = 1f
            divisor = divisor * 10f
            result = result + (char - '0') / divisor
            decimalCount = decimalCount + 1
        }
        else {
            result = result * 10 + (char - '0').toFloat()
        }
    }
    return Pair(if (isNegative) -result else result, decimalCount)
}
