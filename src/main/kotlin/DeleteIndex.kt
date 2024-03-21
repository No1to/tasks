package org.example

fun main() {

    val arr = arrayOf("apple", "banana", "cherry", "mango")
    val index = 0
    val resultArray = arr.sliceArray(0 until index) + arr.sliceArray(index + 1 until arr.size)
    println(resultArray.contentToString())

    /*val arrayone: ArrayList<String> = arrayListOf("a", "b", "c")

    val arraytwo: ArrayList<String> = arrayListOf(arrayone.removeAt(1))

    for (item in arraytwo) {
        println(item)
    }*//*val arrayone: ArrayList<String> = arrayListOf("a", "b", "c")

    val arraytwo = arrayone.drop(0)

    for (item in arraytwo) {
        println(item) // now prints all except the first one...
    }*/

    /*val arr = arrayOf("apple", "banana", "cherry", "banana", "apple")
    val elementToDelete = "bananaa"
    val result = arr.filter { it != elementToDelete }.toTypedArray()
    println(result.contentToString())*/
}