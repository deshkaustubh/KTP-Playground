package org.example.EP4ext

import parseInt

fun main(){
    println(evaluate("1+2"))
}

fun evaluate(expression: String) : MutableList<Char> {
    var plusList = mutableListOf<String>()
    var minusList = mutableListOf<String>()
    var indiceList = mutableListOf<Char>()
    var string = ""

   for ( i in 0 until expression.length){
       if(expression[i] in listOf('-','+')){
           var j = i + '0'
           indiceList.add(i + '0')
           break
       }
   }
    return  indiceList
}