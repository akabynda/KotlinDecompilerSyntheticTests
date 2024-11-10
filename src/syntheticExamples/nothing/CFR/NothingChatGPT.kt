package syntheticExamples.nothing.CFR

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    fail("An error occurred")
}
