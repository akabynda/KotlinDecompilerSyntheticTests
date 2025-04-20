package syntheticExamplesWoFixes.loops.Fernflower

object LoopJ2K {
    fun main() {
        for (i in 0..4) {
            val var1 = "Итерация $i"
            println(var1)
        }
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}