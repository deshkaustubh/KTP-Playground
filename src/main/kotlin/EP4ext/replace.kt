package EP4ext


fun main (){
    println( replace("Blue",'B','C',true))
}

fun replace(text: String, char: Char, replacement: Char, ignoreCase: Boolean): String {
    var txt = text
    var charInText = char

    if (ignoreCase) {
        txt = convertToLowercase(txt)
        charInText = convertToLowercase(char)
    }

    val resultString = buildString {
        //for (i in 0..txt.length - 1) {
        repeat(text.length){ i->
            if (txt[i] == charInText) {
                append(replacement)
            } else {
                append(txt[i])
            }
        }
    }
    return resultString
}

fun convertToLowercase(text: String): String {
    return buildString {
        for (char in text){
            append(convertToLowercase(char))
        }
    }
}

fun convertToLowercase(char: Char): Char {
    return when(char){
        in 'A'..'Z' -> char.lowercaseChar()
        else -> char
    }
}