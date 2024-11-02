/*
Question 15 of pdf
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
    pattern3(5)
}

fun pattern3(lines: Int) {
    repeat(lines){
        repeat(it * 2){
            print(" ")
        }
        repeat(lines - it ){
            print("*")
        }
        println()
    }
    val ulta = lines -1
    repeat(ulta){
        repeat( 2 * (ulta - it - 1) ){ // Updated this spaces corrected this * pending
            print(" ")
        }
        repeat(it + 2){// Actually no changes reequired hare changes were needed only in spaces so program is complete
            print("*")
        }
        println()
    }
}
