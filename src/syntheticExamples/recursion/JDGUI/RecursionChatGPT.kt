package syntheticExamples.recursion.JDGUI

fun factorial(n: Int): Int = if (n <= 1) 1 else n * factorial(n - 1)

fun main() {
    val i = factorial(5)
    println(i)
}
