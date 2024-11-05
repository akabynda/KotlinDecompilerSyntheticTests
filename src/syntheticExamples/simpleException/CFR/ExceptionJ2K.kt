package syntheticExamples.simpleException.CFR

object ExceptionJ2K {
    fun main() {
        try {
            val n = 10 / 0
        } catch (e: ArithmeticException) {
            println("Division by zero!" as Any)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}