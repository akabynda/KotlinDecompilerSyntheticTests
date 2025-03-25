package syntheticExamples.abruptControlFlow.JDGUI

fun main() {
    for (i in 1 until 11) {
        if (i == 5) {
            println("Breaking the loop at $i")
            break
        }
        if (i % 2 == 0) {
            println("Skipping even number: $i")
        } else {
            println("Current value: $i")
        }
    }
}
