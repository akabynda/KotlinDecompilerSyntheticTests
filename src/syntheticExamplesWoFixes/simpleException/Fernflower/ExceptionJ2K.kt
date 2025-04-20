package syntheticExamplesWoFixes.simpleException.Fernflower

object ExceptionJ2K {
    fun main() {
        try {
            val var0 = 10 / 0
        } catch (var2: ArithmeticException) {
            val var1 = "Division by zero!"
            println(var1)
        }
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}