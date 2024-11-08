package syntheticExamples.sequenceProcessing.JDGUI

fun main() {
    val arrayOfInteger = arrayOf(1, 2, 3, 4, 5)

    val numbers = arrayOfInteger.asSequence()
        .filter { it % 2 == 0 }
        .map { it * it }
        .toList()

    println(numbers)
}
