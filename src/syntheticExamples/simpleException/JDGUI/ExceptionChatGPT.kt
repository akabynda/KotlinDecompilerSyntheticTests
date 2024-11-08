package syntheticExamples.simpleException.JDGUI

fun main() {
    try {
        val i = 10 / 0
    } catch (e: ArithmeticException) {
        println("Division by zero!")
    }
}
