package syntheticExamples.simpleLambda.CFR

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.forEach {
        val n2 = it * it
        println(n2)
    }
}
