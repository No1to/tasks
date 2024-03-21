package org.example

fun main() {
    val arrayNames: Array<String> =
        arrayOf("Абу", "Адилет", "Алтынай", "Чынгыз", "Бексултан", "Кума", "Атай", "Генри", "Дин", "Сэм")

    val nameToSpell = "ААААААААААААААААААААААААааъъъ"
    val assembledName = StringBuilder()

    for (char in nameToSpell) {
        for (name in arrayNames) {
            if (name.contains(char)) {
                assembledName.append(char)
                break
            }
        }
    }

    println("Собранное имя: $assembledName")
}