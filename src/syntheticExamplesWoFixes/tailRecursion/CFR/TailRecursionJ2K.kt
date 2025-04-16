package syntheticExamplesWoFixes.tailRecursion.CFR

object TailRecursionJ2K {
    fun sum(n: Int, acc: Int): Int {
        var n = n
        var acc = acc
        while (n != 0) {
            val n2 = n - 1
            val n3 = acc + n
            n = n2
            acc = n3
        }
        return acc
    }

    fun `sum$default`(n: Int, n2: Int, n3: Int, `object`: Any?): Int {
        var n2 = n2
        if ((n3 and 2) != 0) {
            n2 = 0
        }
        return sum(n, n2)
    }

    fun main() {
        val n = `sum$default`(10000, 0, 2, null)
        println(n)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}