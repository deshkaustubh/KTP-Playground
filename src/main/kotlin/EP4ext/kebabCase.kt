fun convertToKebabCase(text: String): String {
    val lowerCaseText = convertToLowercaseAndTrimSpace(text)
    return buildString {
        for (char in lowerCaseText ){
            if (char == ' '){
                append('-')
            } else {
                append(char)
            }
        }
    }
}

//fun convertToLowercase(text: String): String {
//    return buildString {
//        for (char in text){
//            append(convertToLowercase(char))
//        }
//    }
//}
//
//fun convertToLowercase(char: Char): Char {
//    return when(char){
//        in 'A'..'Z' -> char.lowercaseChar()
//        else -> char
//    }
//}

fun convertToLowercaseAndTrimSpace(text: String):String {
    var result = ""
    for(char in text){
        if(char in 'A'..'Z'){
            result += (char + 32)
        }
        else if(char == ' ') {
            if(result.last() != ' ') {
                result += char
            }
        }
        else {
            result += char
        }
    }
    return result
}

fun main(){
    print(convertToKebabCase("This  is       465    KebabCase"))
}
