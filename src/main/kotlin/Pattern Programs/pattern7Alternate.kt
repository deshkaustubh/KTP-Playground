/*
Qsn 19 of pdf NOTE: This pattern only works for odd number of lines
ALTERNATE SOLUTION
*******
*** ***
**   **
*     *
**   **
*** ***
*******
 */

fun main() {
    pattern7Alternate(17)
}

fun pattern7Alternate(lines: Int) {
    if (lines % 2 == 0 || lines <= 1) return

    repeat(lines){ print("*") }
    println()
    val halfLine = lines / 2
    repeat(halfLine) { i ->
        printRow(halfLine - i, 2 * i + 1, halfLine - i)
    }

    repeat(halfLine - 1) { i ->
        printRow(i + 2, 2 * (halfLine - 1 - i) - 1, i + 2)
    }

    repeat(lines) { print("*") }
}

fun printRow(stars: Int, spaces: Int, stars2: Int) {
    repeat(stars) { print("*") }
    repeat(spaces) { print(" ") }
    repeat(stars2) { print("*") }
    println()
}
