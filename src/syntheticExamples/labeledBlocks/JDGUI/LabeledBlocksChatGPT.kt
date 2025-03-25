package syntheticExamples.labeledBlocks.JDGUI;

fun main() {
    outer@ for (i in 1 until 6) {
        for (j in 1 until 6) {
            if (i * j > 6) {
                println("Breaking out of the outer loop at i = $i, j = $j")
                break@outer
            }
            println("i = $i, j = $j")
        }
    }
}
