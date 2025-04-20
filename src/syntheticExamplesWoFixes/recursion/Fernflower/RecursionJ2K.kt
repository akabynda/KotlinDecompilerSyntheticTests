package syntheticExamplesWoFixes.recursion.Fernflower

object RecursionJ2K {
    fun factorial(n: Int): Int {
        return if (n <= 1) 1 else n * factorial(n - 1)
    }

    fun main() {
        val var0 = factorial(5)
        println(var0)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}