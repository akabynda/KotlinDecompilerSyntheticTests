package syntheticExamples.recursion.CFR

fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun main() {
    val n = factorial(5)
    println(n)
}
