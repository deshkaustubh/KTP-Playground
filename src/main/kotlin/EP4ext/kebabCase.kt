fun convertToKebabCase(text: String): String {
    val lowerCaseText = convertToLowercase(text)
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

fun main(){
    print(convertToKebabCase("This is KebabCase"))
}
