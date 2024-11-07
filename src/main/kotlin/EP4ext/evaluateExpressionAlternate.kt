package org.example.EP4ext

import java.util.Scanner

fun main() {
    val input = "-1+2-3"
    val scanner = Scanner(input.replace("+", " +").replace("-", " -"))

    val positiveNumbers = mutableListOf<Int>()
    val negativeNumbers = mutableListOf<Int>()

    while (scanner.hasNext()) { // here hasNext is for running the while loop until it has next element
        val number = scanner.nextInt() // this takes the next input after space as Int
        if (number > 0) {
            positiveNumbers.add(number)
        } else {
            negativeNumbers.add(number)
        }
    }

    val sumPositive = positiveNumbers.sum()
    val sumNegative = negativeNumbers.sum()
    val resultEvaluation = sumNegative + sumPositive

    println("$resultEvaluation")
}
