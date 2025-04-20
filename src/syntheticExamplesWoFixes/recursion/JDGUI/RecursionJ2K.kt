package syntheticExamplesWoFixes.recursion.JDGUI

object RecursionJ2K {
    fun factorial(n: Int): Int {
        return if ((n <= 1)) 1 else (n * factorial(n - 1))
    }

    fun main() {
        val i = factorial(5)
        println(i)
    }
}

fun main() {
    RecursionJ2K.main()
}