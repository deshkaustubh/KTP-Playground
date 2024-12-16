package EP5

import javax.xml.stream.events.EndElement

// List -> Elements can't be updated/ added/ removed
// Immutable List -> Elements can be updated / added / removed

// 2 Approaches inPlace and newList

// New List -> Builds a new list using buildList

fun update(list: List< Int>, index : Int, value : Int) : List < Int> {
    return buildList {
        for ( i in list.indices) {
            if ( i == index) add(value) else add(list[i])
        }
    }
}

fun addAtEnd(list: List<Int>, element: Int) : List< Int> {
    return list + element
}

fun addAtStart(list: List<Int>, element: Int): List<Int> {
    return buildList {
        add(element)
        list.forEach { add(it) }
    }
}

fun addAt(list: List<Int>, index: Int, element: Int) : List< Int> {
    return buildList {
        for ( i in list.indices) {
            if ( i == index) add(element)
            add(list[i])
        }
    }
}

fun removeAt(list: List<Int>, index: Int) : List<Int> {
    return  buildList {
        for ( i in list.indices) {
            if ( i != index) add(list[i])
        }
    }
}

fun remove(list: List<Int>, element: Int, all: Boolean): List<Int> {
    return buildList {
        var foundOne = false
        for (x in list) {
            if ( x == element){
                if ( all ) continue

                if ( !foundOne ) {
                    foundOne = true
                    continue
                }
            }
            add(x)
        }
    }
}

fun replace(list: List<Int>, element: Int, replacement: Int ): List< Int> {
    val index = list.indexOf(element) // indexOf is a builtin Function
    return if( index != -1) {
        buildList {
            for (i in list.indices) {
                if ( i == index) add(replacement)
                else add(list[i])
            }
        }
    }
    else list
}

fun replaceAll (list: List<Int>, element: Int, replacement: Int): List< Int> {
    return buildList {
        for (x in list) {
            if ( x == element) add(replacement)
            else add(x)
        }
    }
}

// In place - changes are made in the existing list

fun update( list: MutableList< Int> , index: Int, value: Int) {
    list[index] = value
}

fun addAtEnd(list: MutableList< Int>, element: Int){
    list.add(element)
}

fun addAtStart(list: MutableList<Int>,element: Int){
    list.add( 0, element)
}

fun addAt(list: MutableList<Int>, index: Int, element: Int) {
    list.add(index, element)
}

fun removeAt(list: MutableList<Int>, index: Int) {
    list.removeAt(index)
}


fun remove(list: MutableList<Int>, element: Int, all : Boolean) {
//    if (all) {
//        while (list.contains(element)) {
//            list.removeAt(element)
//        }
//    }
//        else {
//            list.remove( element)
//        }
    do {
        list.remove(element)
    }
        while (all && list.contains(element))
}

fun replace(list: MutableList<Int>, element: Int, replacement: Int) {
    val index = list.indexOf(element)
    if ( index != -1) {
        list[index] = replacement
    }
}

fun replaceAll(list: MutableList<Int>, element: Int, replacement: Int) {
    for ( i in list.indices) {
        if ( list[i] == element) list[i] = replacement
    }
}


fun main() {
    val list = listOf(0, 1, 2, 3)
    println(update(list, 0, 4))
    println(addAt(list,4,5))
    println(addAtStart(list , 4))
    println(addAtEnd(list, 19))
    println(remove(list, 1, false))
    println(remove(list, 2 , true))
}
