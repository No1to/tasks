package org.example

//Соедините два массива в один
fun main() {
    val arrayOne = arrayOf(1, 2, 5, 7, 22)
    val arrayTwo = arrayOf(1, 4, 44, 0, 22)
    val arrayThree = mutableListOf<Int>()

    arrayThree.addAll(arrayOne)
    arrayThree.addAll(arrayTwo)
    arrayThree.sort()

    println(arrayThree)
}