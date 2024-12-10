package EP5

fun elementAt(list: List<Int>,index: Int) : Int? {
    if ( index < 0 || index > list.lastIndex) return null
    return list[index]  // in such cases IndexOutOfBoundException is possible so null is used.
}

