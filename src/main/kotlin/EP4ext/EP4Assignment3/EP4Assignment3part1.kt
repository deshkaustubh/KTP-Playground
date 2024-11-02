package EP4Assignment3

/*
3.1 Perfect Numbers
 A positive integer that is equal to the sum of its proper divisors (excluding itself). For example,
28 is a perfect number because (1 + 2 + 4 + 7 + 14 = 28).
 */

fun main(){
    printPerfectNumbersUpTo(100)
}

fun checkPerfect(number: Int): Boolean{
    var sum : Int = 0
    for(i in 1 until number){ // Did the logic on my own but in place of until i used .. so it wasn't working at this point i used copilot's help
        if(number % i == 0){
            sum = sum + i
        }
    }
    //if (sum == number) return true else return false
    //->Concise Approach
    return sum == number
}

fun printPerfectNumbersUpTo(upTo: Int) {
    for (i in 1..upTo) {
        if (checkPerfect(i)) {
            println("$i -> perfect number")
        }
    }
}