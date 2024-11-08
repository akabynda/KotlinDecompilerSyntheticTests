package syntheticExamples.nothing.JDGUI

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    fail("An error occurred")
}
