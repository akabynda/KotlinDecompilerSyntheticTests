package syntheticExamplesWoFixes.labeledBlocks.Fernflower

object LabeledBlocksJ2K {
    fun main() {
        for (i in 1..5) {
            for (j in 1..5) {
                var var2: String
                if (i * j > 6) {
                    var2 = "Breaking out of the outer loop at i = $i, j = $j"
                    println(var2)
                    return
                }

                var2 = "i = $i, j = $j"
                println(var2)
            }
        }
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}