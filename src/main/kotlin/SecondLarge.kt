package org.example

//Найдите второе по величине число в массиве
fun main() {

    val numbers = arrayOf(0, 12, 74, 26, 82, 176, 189, 8, 55, 3, 189)

    // old Arrays.toString(numbers) new numbers.contentToString
    println("Numders: ${numbers.contentToString()}")

    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (n in numbers) {
        if (n > first) {
            second = first
            first = n
        } else if (n != first && n > second) {
            second = n
        }
    }

    println("Second: $second")
    println("First: $first")
    /*val numArray = doubleArrayOf(23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5)
    var largest = numArray[0]
    var secondLargest = Double.MIN_VALUE

    for (num in numArray) {
        if (num > largest) {
            secondLargest = largest
            largest = num
        } else if (num > secondLargest && num != largest) {
            secondLargest = num
        }
    }

    if (secondLargest == Double.MIN_VALUE) {
        println("Второе по величине число не найдено.")
    } else {
        println("Второе по величине число: $secondLargest")
    }*/
}