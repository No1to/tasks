package org.example


/*
a shit it's too simple xD
fun main() {
    val mutableList = mutableListOf("a", "b", "c", "d", "e")
    mutableList.removeLast()

    println(mutableList)
}*/

fun removeLastItem(array: IntArray): IntArray {
    return array.copyOf(array.lastIndex)
}

fun main() {
    var array: IntArray = intArrayOf(5, 3, 4, 7, 6, 8, 9)
    array = removeLastItem(array)
    println(array.contentToString())
}