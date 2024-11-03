package syntheticExamples.tailRecursion.Fernflower

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u001b\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\u0010¨\u0006\u0006"],
    d2 = ["main", "", "sum", "", "n", "acc", "KotlinDecompiler"]
)
 */
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