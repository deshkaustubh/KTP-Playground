package org.example.EP4ext

import java.util.Scanner

fun main() {
    val expression = "-1+2-3"
    //here in scanner I could have used the substring function by changing char type of char and replacement to String
    val addSpaceToSign = Scanner(expression.replace("+", " +").replace("-", " -"))

    val positiveNumbers = mutableListOf<Int>()
    val negativeNumbers = mutableListOf<Int>()

    while (addSpaceToSign.hasNext()) { // here hasNext is for running the while loop until it has next element
        val number = addSpaceToSign.nextInt() // this takes the next input after space as Int
        if (number > 0) {
            positiveNumbers.add(number) // add == append
        } else {
            negativeNumbers.add(number)
        }
    }

    val sumPositive = positiveNumbers.sum()
    val sumNegative = negativeNumbers.sum()
    val resultEvaluation = sumNegative + sumPositive

    println("$resultEvaluation")
}
