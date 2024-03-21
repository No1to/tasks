package org.example

/*
fun main(args: Array<String>) {
    val myList = listOf(1, 4, 8, 5, 6, 9, 12, 10, 33)
    val filteredList = myList.filter { x -> x % 2 == 0 }
    println("Original List : ${myList}")
    println("Filtered List : ${filteredList}")
}*/

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    val evenCount = countEvenNumbers(numbers)
    val oddCount = countOddNumbers(numbers)

    println("Number of even elements: $evenCount")
    println("Number of odd elements: $oddCount")
}

fun countEvenNumbers(numbers: Array<Int>): Int {
    var count = 0

    for (number in numbers) {
        if (number % 2 == 0) {
            count++
        }
    }

    return count
}

fun countOddNumbers(numbers: Array<Int>): Int {
    var count = 0

    for (number in numbers) {
        if (number % 2 != 0) {
            count++
        }
    }

    return count
}