package syntheticExamplesWoFixes.simpleException.JDGUI

object ExceptionJ2K {
    fun main() {
        try {
            val i = 10 / 0
        } catch (e: ArithmeticException) {
            println("Division by zero!")
        }
    }
}

fun main(args: Array<String>) {
    ExceptionJ2K.main()
}