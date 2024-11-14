package syntheticExamples.simpleLambda.Bytecode

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach { n ->
        val square = n * n
        println(square)
    }
}

/*
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.map { it * it }
        .forEach { println(it) }
}
 */
