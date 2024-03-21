package org.example

import kotlin.math.min

// -Удалите минимальный элемент из массива
// Java implementation of the approach
internal object GFG {
    // Function to return the minimum
    // deletions to get minimum OR
    fun findMinDel(arr: IntArray, n: Int): Int {
        // To store the minimum element

        var minNum = Int.MAX_VALUE

        // Find the minimum element
        // from the array
        for (i in 0 until n) minNum = min(arr[i].toDouble(), minNum.toDouble()).toInt()

        // To store the frequency of
        // the minimum element
        var cnt = 0

        // Find the frequency of the
        // minimum element
        for (i in 0 until n) if (arr[i] == minNum) cnt++

        // Return the final answer
        return n - cnt
    }

    // Driver code
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        val n = arr.size

        print(findMinDel(arr, n))
    }
}