package org.example

fun main() {
    val inputArray = listOf(10, 5, 4, 6, 8, 1, 3, 9, 2)
    var smallestElement = Int.MAX_VALUE
    var largestElement = Int.MIN_VALUE

    for (item in inputArray) {
        if (item < smallestElement) smallestElement = item
        if (item > largestElement) largestElement = item
    }

    val newArray = inputArray.filter { num -> num != smallestElement && num != largestElement }

    println(newArray)
}

/*
let inputArray = [10, 5, 4, 6, 8, 1, 3, 9, 2];
let smallestElement = Infinity;
let largestElement = -Infinity;

for (let item of inputArray) {
    if (item < smallestElement) smallestElement = item;
    if (item > largestElement) largestElement = item;
}

let newArray =
    inputArray.filter(
        num => num !== smallestElement && num !== largestElement);

console.log(newArray);
*/