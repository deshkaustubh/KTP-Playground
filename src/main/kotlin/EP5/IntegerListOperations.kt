package EP5

fun elementAt(list: List<Int>,index: Int) : Int? {
    if ( index < 0 || index > list.lastIndex) return null
    return list[index]  // in such cases IndexOutOfBoundException is possible so null is used above.
}

fun findMin(list: List<Int>): Int? {
    if ( list.isEmpty()) return null
    var min = list[0] // or list.first() is used for readability // or Int.MAX_VALUE
    for ( element in list) {
        if ( element < min)  min = element
    }
    return min
}

fun findMax(list: List<Int>): Int? {
    if ( list.isEmpty()) return null
    var max = Int.MIN_VALUE
    for ( element in list) {
        if ( element > max)  max = element
    }
    return max
}

fun calculateSum(list: List<Int>): Int {
    var sum = 0

    for ( eachElement in list) sum += eachElement // list.forEach { sum += it}

    return sum
}

fun calculateMean(list: List<Int>): Float {
    return calculateSum(list) / list.size.toFloat()
}

fun find(list: List<Int>, element: Int): Int {
    for (i in list.indices) {
        if (list[i] == element) return i
    }
    return -1
}

fun findAll(list: List<Int>, element: Int): List<Int> {
    return buildList {
        for ( i in list.indices) {
            if ( list[i] == element) add(i)
        }
    }
}

fun main () {
    val list = listOf(23, 56, 64, 26, 58, 34, 29, 23, 63)
    println(elementAt(list , 0))
    println(findMin(list))
    println(findMax(list))
    println(calculateSum(list))
    println(calculateMean(list))
    println(find(list , 23))
    println(findAll(list, 23))
}