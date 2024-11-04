package org.example.EP4ext

fun main (){
    println(convertToKebabCase("kebab casE AlTerNate/ Better SolUTIoN"))
}

fun convertToKebabCase(text: String):String{
    return buildString {
        var previousSpace = false
        for (char in text){
            val lowerCaseChar = if (char in 'A'..'Z') char + 32 else char
            if (lowerCaseChar == ' ') {
                if (!previousSpace) {
                    append('-')
                    previousSpace = true
                }
            }
                else {
                    append(lowerCaseChar)
                    previousSpace = false
                }
            }
        }
    }