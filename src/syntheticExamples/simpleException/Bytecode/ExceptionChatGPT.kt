package syntheticExamples.simpleException.Bytecode

fun main() {
    try {
        val result = 10 / 0
    } catch (e: ArithmeticException) {
        println("Division by zero!")
    }
}
