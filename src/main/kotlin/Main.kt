package org.example

import kotlin.math.exp

fun main(){
    println(evaluate("-51+1"))
}

fun evaluate(expression : String) : Int{
    if (expression.isEmpty()) return 0
    var prvsIsOpeartor = false
    val startIndex = 0
    var result = 0
    var operation : Char

    for( i in startIndex until expression.length){
//        operation =if(expression[i] == '+'){
//            '+'
//        }
//        else if(expression[i] == '-') {
//            '-'
//        }
//        else{
//            expression[i]
//        }
//
//
//        if(expression[0] in listOf('+','-')){
//            if (expression[0] == '+'){
//                result = +1
//            }
//            else{
//                result = -1
//            }
//        }
        if(expression[i] in listOf('+','-')) {
            prvsIsOpeartor = true
            continue
        }

        if(prvsIsOpeartor){
            if(expression[i-1] == '+'){
                val char = expression[i]
                result += (char - '0')
                prvsIsOpeartor = false
            }
            else if ( expression[i-1] == '-') {
                val char = expression[i]
                result -= (char - '0')
                prvsIsOpeartor = false
            }
        }
        else{
            if(expression[0] == '+'){
                val char =expression[i]
                result = result * 10 + (char - '0')
            }
            else if( expression[0] =='-'){
                val char =expression[i]
                result = result * 10 + (char - '0')
                result = -result
            }
            else {
                val char = expression[i]
                result = result * 10 + (char - '0')
            }
        }
    }
    return  result
}