package org.example.EP4ext

import parseInt

fun main (){
    println(evaluateExpression("-1+2+3-5+200"))
}

fun evaluateExpression(exp: String): Int{
    var res = 0
    var isNeg = false
    var num = ""

    for(i in 0..exp.length) {
        if(i == exp.length || exp[i] in listOf('+','-')) {

            if (num.isNotEmpty()) {
                var parsedNum = parseInt(num)
                if (isNeg) {
                    parsedNum *= -1
                    isNeg = false
                }
                res += parsedNum
                num = ""
            }

            if (i < exp.length && exp[i] == '-') isNeg = true
        }
        else {
            num += exp[i]
        }
    }
    return res
}