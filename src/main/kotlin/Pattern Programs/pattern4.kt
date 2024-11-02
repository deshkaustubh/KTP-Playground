/*
Question 16 of pdf
    *****
   ****
  ***
 **
*
 **
  ***
   ****
    *****
 */

fun main() {
    pattern4(5)
}

fun pattern4(lines: Int) {
    repeat(lines) {
        repeat(lines - (it + 1)) {
            print(" ")
        }
        repeat(lines - it) {
            print("*")
        }
        println()
    }
    val ulta : Int = lines -1
    repeat(ulta) {
        repeat(it + 1) {
            print(" ")
        }
        repeat(it + 2) {
            print("*")
        }
        println()
    }
}
