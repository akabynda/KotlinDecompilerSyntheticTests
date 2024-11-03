package syntheticExamples.nothing.Fernflower

/**
 * Throws an IllegalArgumentException with the provided message.
 *
 * @param message The error message to include in the exception.
 * @return Nothing because this function always throws an exception.
 */
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

/**
 * The main entry point of the application.
 *
 * Demonstrates the usage of the `fail` function which throws an exception.
 */
fun main() {
    fail("An error occurred")
}
