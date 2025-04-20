package syntheticExamples.tailRecursion.CFR

object TailRecursionJ2K {
    fun sum(n: Int, acc: Int): Int {
        var n2 = n
        var n3 = acc
        while (n2 != 0) {
            val n4 = n2 - 1
            val n5 = n3 + n2
            n2 = n4
            n3 = n5
        }
        return n3
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