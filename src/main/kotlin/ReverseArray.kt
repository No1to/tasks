package org.example

fun reverseArray(array: IntArray): IntArray {
    val reversedArray = IntArray(array.size)
    for (i in array.indices) {
        reversedArray[i] = array[array.size - 1 - i]
    }
    return reversedArray
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val reversed = reverseArray(array)
    println("Исходный массив: ${array.joinToString()}")
    println("Перевернутый массив: ${reversed.joinToString()}")
}