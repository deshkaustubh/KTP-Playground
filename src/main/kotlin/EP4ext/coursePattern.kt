package org.example.EP4ext

fun getDigitsPowerSum(num: Int): Int {
    var number = num
    var result = 0
    var powercount = 1

    while (number != 0) {
        val digit = number % 10
        result += power(digit, powercount)
        number /= 10
        powercount = powercount + 1
    }
    return result
}

fun main() {
    println(getDigitsPowerSum(123))
}

fun power(base: Int, exponent : Int): Int{
    var result = 1
    repeat(exponent){
        result *= base
    }
    return result
}
// Actually I had messed up there was no need of calculating no of digits and because of
// wrong direction it was taking lots of time this was simple i overestimated it.

