/*
Qsn 19 of pdf NOTE: This pattern only works for odd number of lines
*******
*** ***
**   **
*     *
**   **
*** ***
*******
 */


fun main(){
    patter7Result(3)
}

fun pattern7(lines: Int){
    val halfLine = lines / 2
    repeat(halfLine){
        repeat(halfLine - it){
            print("*")
        }
        repeat(2 * it + 1){
            print(" ")
        }
        repeat(halfLine - it){
            print("*")
        }
        println()
    }
    // Reverse Pattern
    val revVar = halfLine - 1
    repeat(revVar){
        repeat(it + 2){
            print("*")
        }
        repeat(2 * (revVar - (it + 1)) + 1){
            print(" ")
        }
        repeat(it + 2){
            print("*")
        }
        println()
    }
}

fun patter7Result(lines: Int){
    if (lines / 2 == 0 || lines == 1){
        print("NOTE: This pattern works only for odd number of lines starting from 3")
    }
    else {
        repeat(lines) {
            print("*")
        }
        println()
        pattern7(lines)
        repeat(lines) {
            print("*")
        }
    }
}