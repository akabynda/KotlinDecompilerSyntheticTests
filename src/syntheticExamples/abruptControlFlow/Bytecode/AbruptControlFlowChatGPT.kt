package syntheticExamples.abruptControlFlow.Bytecode

fun main() {
    var i = 1
    while (i < 11) {
        if (i == 5) {
            println("Breaking the loop at $i")
            break
        } else if (i % 2 == 0) {
            println("Skipping even number: $i")
        } else {
            println("Current value: $i")
        }
        i++
    }
}
