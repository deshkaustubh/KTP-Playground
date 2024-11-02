package EP4Assignment3

/*
3.2 Harshad Numbers
 Check if a number is a Harshad number, which is an integer that is divisible by the sum of its
digits. For example, 18 is a Harshad number because (1 + 8 = 9) and (18 / 9 = 2).
 */

fun main(){
    printHarshadNumbersUpTo(100)
}

fun checkHarshad(num: Int): Boolean{ // Here interestingly I took help of print reverse number program
    var sum = 0
    var number = num
    while(number != 0){
        val digit = number % 10
        sum = sum + digit
        number = number / 10
    }
    //if (num % sum != 0) return false else return true
    //concise approach ->
    return num % sum == 0
}

fun printHarshadNumbersUpTo(upTo: Int) {
    for (i in 1..upTo) {
        if (checkHarshad(i)) {
            println("$i -> Harshad number")
        }
    }
}