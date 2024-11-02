/*
Question 5 of pdf
     *
    *!*
   *!*!*
  *!*!*!*
 *!*!*!*!*
 */

fun main() {
    pattern2(5)
}

fun pattern2(lines: Int) {
    repeat(lines){
        repeat(lines - it){
            print(" ")
        }
        repeat(2 * it + 1 ){j->
            print(if(j %2 == 0) "*" else "!") // This was new to see so used this format
        }
        println()
    }
}