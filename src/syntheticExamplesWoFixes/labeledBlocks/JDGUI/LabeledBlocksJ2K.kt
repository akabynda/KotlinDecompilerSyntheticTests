package syntheticExamplesWoFixes.labeledBlocks.JDGUI

object LabeledBlocksJ2K {
    fun main() {
        var i = 1
        label16@ while (i < 6) {
            for (j in 1..5) {
                if (i * j > 6) {
                    println("Breaking out of the outer loop at i = $i, j = $j")
                    break@label16
                }
                println("i = $i, j = $j")
            }
            i++
        }
    }
}

fun main() {
    LabeledBlocksJ2K.main()
}