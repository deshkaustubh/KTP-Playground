package EP4ext

fun main (){
    println(subString("All is well", 7, 11))
}

fun subString(text: String, start: Int, end: Int): String {
    val resultString = buildString {
        repeat(text.length){i->
            if ( end > text.length) return ""
            if (i in start..end){
                append(text[i])
            }
        }
    }
    return resultString
}
