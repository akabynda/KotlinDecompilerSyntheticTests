package syntheticExamples.nothing.Bytecode

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    fail("An error occurred")
    // Cannot access 'KotlinNothingValueException': it is internal in 'kotlin'
    // throw KotlinNothingValueException()
}
