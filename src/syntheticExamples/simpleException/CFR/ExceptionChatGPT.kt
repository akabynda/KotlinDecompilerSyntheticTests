package syntheticExamples.simpleException.CFR

fun main() {
    try {
        val n = 10 / 0
    } catch (e: ArithmeticException) {
        println("Division by zero!")
    }
}
