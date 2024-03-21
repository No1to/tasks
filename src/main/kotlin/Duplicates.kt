package org.example

// Проверьте, содержит ли массив дубликаты и выведите их
fun <T> hasDuplicates(arr: Array<T>): Boolean {
    return arr.size != hashSetOf(*arr).size
}

fun main() {
    val arr: Array<Int> = arrayOf(4, 6, 8, 3, 1)
    if (hasDuplicates(arr)) {
        println("Repeated elements found")
    } else {
        println("No repeated elements found")
    }
}