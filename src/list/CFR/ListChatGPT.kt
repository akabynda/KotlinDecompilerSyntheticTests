package list.CFR

fun main() {
    val stringArray = arrayOf("Яблоко", "Банан", "Вишня")
    val list = listOf(*stringArray)

    for (fruit in list) {
        println(fruit)
    }
}

/* Alternative

fun main() {
    val fruits = listOf("Яблоко", "Банан", "Вишня")
    fruits.forEach { println(it) }
}

 */