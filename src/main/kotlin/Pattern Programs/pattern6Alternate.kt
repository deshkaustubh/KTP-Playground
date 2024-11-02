/*
Question 19 of pdf -> Better Solution
   *
  * *
 *   *
  * *
   *
 */

fun pattern6Alternate(lines : Int){
    val halfLine = (lines  / 2) + 1
    // UPPER HALF
    repeat(halfLine){i->
        repeat(halfLine - i - 1) { print(" ") }
        val width = 2 * i + 1
        repeat(width){j->
            when(j){
                 0 , width - 1 -> print("*")
                else -> print(" ")
            }
        }
        println()
    }
    // LOWER HALF
    for (i in (halfLine - 2) downTo  0){
        repeat(halfLine - i - 1) { print(" ") }
        val width = 2 * i + 1
        repeat(width){j->
            when(j){
                0 , width - 1 -> print("*")
                else -> print(" ")
            }
        }
        println()
    }
}

fun main(){
    pattern6Alternate(7)
}
