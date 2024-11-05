package org.example.EP4ext


// NOT CORRECT ......................................
import parseInt

fun main() {
    println(evaluateExpressionAlternate("-1+2+3-5+200"))
    println(signIndex(expression = "-1+2+3-5+200" ))
}

fun evaluateExpressionAlternate(expression: String):Int{
    var isNegative = false
    var num = ""
    var result = 0

    repeat(expression.length){
        if(it in signIndex(expression)){
            if(expression[it] == '-') isNegative = true
        }

    }
    return result
}

fun signIndex(expression: String): MutableList<Int> {
    val indices = mutableListOf<Int>()
    for ( i in 0..expression.length-1){
        if (expression[i] in listOf('-', '+')){
            indices.add(i)
        }
    }
    return indices
}