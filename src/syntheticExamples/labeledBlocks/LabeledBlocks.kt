package syntheticExamples.labeledBlocks

fun main() {
    outerLoop@ for (i in 1..5) {
        for (j in 1..5) {
            if (i * j > 6) {
                println("Breaking out of the outer loop at i = $i, j = $j")
                break@outerLoop
            }
            println("i = $i, j = $j")
        }
    }
}
