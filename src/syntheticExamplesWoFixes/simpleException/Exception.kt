package syntheticExamplesWoFixes.simpleException

fun main() {
    try {
        val division = 10 / 0
    } catch(e: ArithmeticException) {
        println("Division by zero!")
    }
}
