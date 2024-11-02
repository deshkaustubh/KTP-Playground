/*
Question 19 of pdf NOTE : This pattern works only for odd number of lines starting from 3
   *
  ***
 *****
*******
 *****
  ***
   *
 */

fun main(){
    patter5Final(7)
}

fun pattern5(lines: Int){
    val halfLine = (lines + 1) / 2 // alias ( lines / 2 ) + 1
    repeat(halfLine){
        repeat(halfLine - it - 1){
            print(" ")
        }
        repeat(2 * it + 1){
            print("*")
        }
        println()
    }
    // Reverse Pattern
    repeat(halfLine - 1){
        repeat(it + 1){
            print(" ")
        }
        repeat(2 * (halfLine - 1 - (it + 1)) + 1){
            print("*")
        }
        println()
    }
}

fun patter5Final(lines: Int){
    if (lines / 2 == 0 || lines == 1){
        print("This pattern works only for odd number of lines starting from 3")
    }
    else {
        pattern5(lines)
    }
}