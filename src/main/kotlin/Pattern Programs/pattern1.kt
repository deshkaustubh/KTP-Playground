/*
Question 5 of pdf
*****
 ****
  ***
   **
    *
 */

fun main() {
    pattern1(5)
}

fun pattern1(lines: Int) {
    repeat(lines){ i ->
        repeat(i){print(" ")}
        for(j in lines downTo  i + 1){ print("*") }
        println()
    }
}
