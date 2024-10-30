package syntheticExamples.list.JDGUI

fun main() {
    val arrayOfString = arrayOf("Яблоко", "Банан", "Вишня")
    val list = arrayListOf(*arrayOfString)
    for (fruit in list) {
        println(fruit)
    }
}

