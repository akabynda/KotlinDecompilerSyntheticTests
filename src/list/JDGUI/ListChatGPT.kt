package list.JDGUI

fun main() {
    val arrayOfString = arrayOf("Яблоко", "Банан", "Вишня")
    val list = listOf(*arrayOfString)

    for (fruit in list) {
        println(fruit)
    }
}
