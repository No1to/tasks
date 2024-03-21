package org.example

fun compressString(input: String): String {
    if (input.isEmpty()) return input

    val compressedStringBuilder = StringBuilder()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            compressedStringBuilder.append(currentChar)
            compressedStringBuilder.append(count)
            currentChar = input[i]
            count = 1
        }
    }

    compressedStringBuilder.append(currentChar)
    compressedStringBuilder.append(count)

    return compressedStringBuilder.toString()
}

fun main() {
    val inputString = "aabbbcccc"
    val compressedString = compressString(inputString)
    println("Исходная строка: $inputString")
    println("Сжатая строка: $compressedString")
}