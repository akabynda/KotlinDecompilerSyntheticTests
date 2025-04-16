package syntheticExamplesWoFixes.recursion.CFR
object RecursionJ2K {
    fun factorial(n: Int): Int {
        return if (n <= 1) 1 else n * factorial(n - 1)
    }

    fun main() {
        val n = factorial(5)
        println(n)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}