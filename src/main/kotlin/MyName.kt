package org.example

//Придумайте 10 разных имен, и по буквам соберите свое имя
fun main() {
    val arrayNames: Array<String> =
        arrayOf("Абу", "Адилет", "Алтынай", "Чынгыз", "Бексултан", "Кума", "Атай", "Винчестр", "Дин", "Сэм")

    val nameToSpell = ""
    val assembledName = StringBuilder()

    for (char in nameToSpell) {
        for (name in arrayNames) {
            if (name.contains(char, ignoreCase = true)) {
                assembledName.append(char)
                break
            }
        }
    }
    println("Собранное имя: $assembledName")
}