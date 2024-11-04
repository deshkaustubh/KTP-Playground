package org.example.`Pattern Programs`/*
Question 19 of pdf -> Better Solution
   *
  * *
 *   *
  * *
   *
 */


fun printRow(spaces: Int, width: Int) {
    repeat(spaces) { print(" ") }
    repeat(width) { j ->
        when (j) {
            0, width - 1 -> print("*")
            else -> print(" ")
        }
    }
    println()
}

fun pattern6Alternate(lines: Int) {
    val halfLine = (lines / 2) + 1

    // UPPER HALF
    repeat(halfLine) { i ->
        printRow(halfLine - i - 1, 2 * i + 1)
    }

    // LOWER HALF
    for (i in (halfLine - 2) downTo 0) {
        printRow(halfLine - i - 1, 2 * i + 1)
    }
}

fun main() {
    pattern6Alternate(5)
}

//fun pattern6Alternate(lines : Int){
//    val halfLine = (lines  / 2) + 1
//    // UPPER HALF
//    repeat(halfLine){i->
//        repeat(halfLine - i - 1) { print(" ") }
//        val width = 2 * i + 1
//        repeat(width){j->
//            when(j){
//                 0 , width - 1 -> print("*")
//                else -> print(" ")
//            }
//        }
//        println()
//    }
//    // LOWER HALF
//    for (i in (halfLine - 2) downTo  0){
//        repeat(halfLine - i - 1) { print(" ") }
//        val width = 2 * i + 1
//        repeat(width){j->
//            when(j){
//                0 , width - 1 -> print("*")
//                else -> print(" ")
//            }
//        }
//        println()
//    }
//}
//
//
//fun main() {
//    pattern6Alternate(5)
//}
