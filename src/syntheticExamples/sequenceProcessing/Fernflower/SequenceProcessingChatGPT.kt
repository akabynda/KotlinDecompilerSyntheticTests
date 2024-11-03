package syntheticExamples.sequenceProcessing.Fernflower

fun main() {
    val numbers = sequenceOf(1, 2, 3, 4, 5)
        .filter { it % 2 == 0 }
        .map { it * it }
        .toList()
    println(numbers)
}
