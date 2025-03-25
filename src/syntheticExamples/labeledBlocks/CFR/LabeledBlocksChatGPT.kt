package syntheticExamples.labeledBlocks.CFR

fun main() {
    loop@ for (i in 1 until 6) {
        for (j in 1 until 6) {
            if (i * j > 6) {
                println("Breaking out of the outer loop at i = $i, j = $j")
                break@loop
            }
            println("i = $i, j = $j")
        }
    }
}
