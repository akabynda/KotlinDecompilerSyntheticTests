package syntheticExamples.simpleException.Fernflower

fun main() {
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Division by zero!")
    }
}
