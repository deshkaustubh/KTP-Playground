package org.example.EP4ext

fun main(){
    search("Pine Apple", ' ', false)
}
fun search(text: String, char : Char, ignoreCase : Boolean) {
    val textIterator = if(ignoreCase) convertToLowercase(text) else text
    val charSearcher = if (ignoreCase) convertToLowercase(char) else char

    var indices = ""
    repeat(textIterator.length){
        if (textIterator[it]== charSearcher){
            indices += if (indices == "") "$it" else ", $it"
        }
    }
    if (indices != "") {
        println("Character $char found at $indices")
    }
    else {
        println("Character $char not present.")
    }
}

fun convertToLowercase(text: String): String {
    var result = ""
    for(char in text){
        result += if(char in 'A'..'Z'){
            (char + 32)
        } else {
            char
        }
    }
    return result
}

fun convertToLowercase(char: Char): Char{
    return if (char in 'A'..'Z') char + 32 else char
}