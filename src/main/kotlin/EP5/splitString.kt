package EP5

fun splitString(string: String, delimiter : Char): List<String> {
    return buildList {
        buildString {
            for (c in string){
                if ( c == delimiter) {
                    add(toString())
                    clear()
                }
                else{
                    append(c)
                }
            }
        }
    }
}

fun parseInts(string: String, delimiter: Char): List<Int> {
    val intsStrList = splitString(string, delimiter)
    return buildList {
        for (intStr in intsStrList){
            add(intStr.toInt())
        }
    }
}