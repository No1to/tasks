package org.example

fun maximumProduct(nums: IntArray): Int {
    nums.sort()
    val n = nums.size

    val maxProduct = nums[n - 1] + nums[n - 2] + nums[n - 3]

    return maxOf(maxProduct)
}

fun main() {
    val nums = intArrayOf(10, 20, 1, 2, 3, 4, 100)
    val maxProduct = maximumProduct(nums)
    println("Максимальное произведение трех чисел в массиве: $maxProduct")
}

/*
fun maximumProduct(nums: IntArray): Int {
    nums.sort()
    val n = nums.size

    // Произведение трех самых больших чисел
    val maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3]

    // Произведение двух самых маленьких чисел (отрицательных) и самого большого числа (положительного)
    val minProduct = nums[0] * nums[1] * nums[n - 1]

    return maxOf(maxProduct, minProduct)
}

fun main() {
    val nums = intArrayOf(-10, -5, 1, 2, 3, 4)
    val maxProduct = maximumProduct(nums)
    println("Максимальное произведение трех чисел в массиве: $maxProduct")
}
*/