package syntheticExamplesWoFixes.nothing

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    fail("An error occurred")
}