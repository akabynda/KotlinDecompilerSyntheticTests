package list.Fernflower

fun main() {
    val fruits = listOf("Яблоко", "Банан", "Вишня")
    for (fruit in fruits) {
        println(fruit)
    }
}

/* Alternative Approach Using forEach:

package list.Fernflower

fun main() {
    listOf("Яблоко", "Банан", "Вишня").forEach { fruit ->
        println(fruit)
    }
}

 */