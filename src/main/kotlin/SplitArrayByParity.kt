package org.example

fun splitArrayByParity(array: IntArray): Pair<List<Int>, List<Int>> {
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()

    for (element in array) {
        if (element % 2 == 0) {
            evenNumbers.add(element)
        } else {
            oddNumbers.add(element)
        }
    }

    return Pair(evenNumbers, oddNumbers)
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val (evenNumbers, oddNumbers) = splitArrayByParity(array)

    println("Четные числа: ${evenNumbers.joinToString()}")
    println("Нечетные числа: ${oddNumbers.joinToString()}")
}