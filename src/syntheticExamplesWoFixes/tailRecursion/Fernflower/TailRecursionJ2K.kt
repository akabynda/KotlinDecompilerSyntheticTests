package syntheticExamplesWoFixes.tailRecursion.Fernflower

object TailRecursionJ2K {
    fun sum(n: Int, acc: Int): Int {
        var n = n
        var acc = acc
        while (n != 0) {
            val var2 = n - 1
            val var3 = acc + n
            n = var2
            acc = var3
        }

        return acc
    }

    // $FF: synthetic method
    fun `sum$default`(var0: Int, var1: Int, var2: Int, var3: Any?): Int {
        var var1 = var1
        if ((var2 and 2) != 0) {
            var1 = 0
        }

        return sum(var0, var1)
    }

    fun main() {
        val var0 = `sum$default`(10000, 0, 2, null as Any?)
        println(var0)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}