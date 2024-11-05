package org.example.EP4ext

import parseInt

fun main (){
    println(evaluateExpression("-1+2+3-5+200"))
}

fun evaluateExpression(expression: String): Int{
    var result = 0
    var isNegative = false
    var number = ""

    for(i in 0..expression.length) {
        if(i == expression.length || expression[i] in listOf('+','-')) {

            if (number.isNotEmpty()) {
                var parsedNumber = parseInt(number)
                if (isNegative) {
                    parsedNumber *= -1
                    isNegative = false
                }
                result += parsedNumber
                number = ""
            }

            if (i < expression.length && expression[i] == '-') isNegative = true
        }
        else {
            number += expression[i]
        }
    }
    return result
}