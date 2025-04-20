package syntheticExamples.labeledBlocks.CFR

object LabeledBlocks {
    fun main() {
        block0@ for (i in 1..5) {
            for (j in 1..5) {
                if (i * j > 6) {
                    println(("Breaking out of the outer loop at i = $i, j = $j") as Any)
                    break@block0
                }
                println(("i = $i, j = $j") as Any)
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}