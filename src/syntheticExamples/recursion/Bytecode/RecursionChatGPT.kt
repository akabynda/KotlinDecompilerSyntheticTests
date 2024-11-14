package syntheticExamples.recursion.Bytecode

fun factorial(n: Int): Int {
    return if (n > 1) n * factorial(n - 1) else 1
}

fun main() {
    val result = factorial(5)
    println(result)
}
