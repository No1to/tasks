package org.example

fun findDuplicates(array: IntArray): List<Int> {
    val elementCountMap = mutableMapOf<Int, Int>()
    val duplicates = mutableListOf<Int>()

    for (element in array) {
        elementCountMap[element] = elementCountMap.getOrDefault(element, 0) + 1
    }

    for ((element, count) in elementCountMap) {
        if (count > 1) {
            duplicates.add(element)
        }
    }

    return duplicates
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 1, 2, 5, 6, 3, 7, 8, 9, 2)
    val duplicateElements = findDuplicates(array)
    println("Элементы встречающиеся более одного раза: ${duplicateElements.joinToString()}")
}