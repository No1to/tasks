package org.example

//Добавьте новый элемент в конец массива
fun main(/*args: Array<String>*/) {
    var fruitNames = arrayOf("apple", "banana", "cherry")
    fruitNames += "mango"
    println(fruitNames.contentToString())
}