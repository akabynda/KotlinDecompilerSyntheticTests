package syntheticExamplesWoFixes.loops.CFR

object LoopJ2K {
    fun main() {
        for (i in 0..4) {
            println(("\u0418\u0442\u0435\u0440\u0430\u0446\u0438\u044f $i") as Any)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}