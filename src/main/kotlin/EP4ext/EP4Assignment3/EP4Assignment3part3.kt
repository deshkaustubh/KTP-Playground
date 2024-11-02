package EP4Assignment3

/*
3.3 Automorphic Numbers
 Check if a number is an automorphic number, which is a number whose square ends in the
same digits as the number itself. For example, 25 is an automorphic number because (25^2 =
625).
 */


fun main(){
    printAutomorphicNumbersUpTo(100)
}

fun checkAutomorphic(num: Int): Boolean { // Here interestingly I took help of print reverse number program
    var noOfDigits = noOfDigits(num)
    val squareofNumber = num * num
    var divisor = 1
    while (noOfDigits != 0){
        noOfDigits -= 1
        divisor *= 10
    }
    val resultVariable = squareofNumber % divisor
    return resultVariable == num
}

fun printAutomorphicNumbersUpTo(upTo: Int) {
    for (i in 1..upTo) {
        if (checkAutomorphic(i)) {
            println("$i -> Automorphic number")
        }
    }
}

fun noOfDigits(num: Int): Int {
    var digit = 0
    var number = num
    while (number != 0) {
        number /= 10
        digit += 1
    }
    return digit
}


//fun main(){
//    printAutomorphicNumbersUpTo(100)
//}
//
//fun checkAutomorphic(num: Int): Boolean { // Here interestingly I took help of print reverse number program
//    var squareofNumber = num * num
//    var digit = 0
//        var number = num
//        while (number != 0) {
//            number = number / 10
//            digit = digit + 1
//        }
//
//    var resultVariable = (squareofNumber % (Math.pow(10.0, digit.toDouble()))).toInt()
//
//    return resultVariable == num
//}
//
//fun printAutomorphicNumbersUpTo(upTo: Int) {
//    for (i in 1..upTo) {
//        if (checkAutomorphic(i)) {
//            println("$i -> Automorphic number")
//        }
//    }
//}