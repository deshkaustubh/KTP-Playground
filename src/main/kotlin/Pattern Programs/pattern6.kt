/*
Question 19 of pdf
   *
  * *
 *   *
  * *
   *
 */

/*
Notice that the * in first and last line is not in center.

Also, you are interpreting lines wrongly. When lines = 7, pattern should contain exactly 7 lines.
Note that this pattern supports only odd number of lines starting from 3.
 */

fun main(){
    pattern6Result(3)
}

fun pattern6(n : Int) {
    val lines = n - 2
    val halfLine = (lines + 1) / 2 // alias ( lines / 2 ) + 1
    repeat(halfLine){
        repeat(halfLine - it - 1){
            print(" ")
        }
        repeat(2 * it + 1){j ->
            if( j == 0){
                print(" * ")
            }
            else {
                print(" ")
            }
        }
        repeat(halfLine - it){ f->
            if( f == 0 ){
                print("*")
            }
            else {
                print("")
            }
        }
        println()
    }
    // Reverse Pattern
    repeat(halfLine - 1){
        repeat(it + 1){
            print(" ")
        }
        repeat(2 * (halfLine - 1 - (it + 1)) + 1){ j->
            if(j== 0){
                print(" * ")
            }else {
                print(" ")
            }
        }
        repeat(it + 2){f->
            if(f==0){
                print("*")
            }
            else{
                print("")
            }
        }
        println()
    }
}

fun pattern6Result (lines: Int){
    if (lines / 2 == 0 || lines == 1){
        print("NOTE: This pattern works only for odd number of lines starting from 3")
    }
    else {
        repeat((lines / 2) + 1) {
            print(" ")
        }
        print("*")
        println()
        pattern6(lines)
        repeat((lines / 2) + 1) {
            print(" ")
        }
        print("*")
    }
}

