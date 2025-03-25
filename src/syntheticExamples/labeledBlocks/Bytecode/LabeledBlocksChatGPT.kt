package syntheticExamples.labeledBlocks.Bytecode

fun main() {
    var i = 1
    outer@ while (i < 6) {
        var j = 1
        while (j < 6) {
            if (i * j <= 6) {
                println("i = $i, j = $j")
            } else {
                println("Breaking out of the outer loop at i = $i, j = $j")
                break@outer
            }
            j++
        }
        i++
    }
}
