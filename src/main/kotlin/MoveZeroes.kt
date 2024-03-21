package org.example

fun moveZeroes(nums: IntArray) {
    var nonZeroIndex = 0

    for (num in nums) {
        if (num != 0) {
            nums[nonZeroIndex++] = num
        }
    }

    while (nonZeroIndex < nums.size) {
        nums[nonZeroIndex++] = 0
    }
}

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)
    println("Исходный массив: ${nums.joinToString()}")
    moveZeroes(nums)
    println("Массив после перемещения нулей в конец: ${nums.joinToString()}")
}