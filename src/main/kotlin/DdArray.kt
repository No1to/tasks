package org.example

fun main() {
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    val newArray = originalArray.flatMap { listOf(it, it) }.toIntArray()
    println("Исходный массив: ${originalArray.joinToString()}")
    println("Новый массив с повторяющимися элементами: ${newArray.joinToString()}")
}