package syntheticExamples.lazyInitialization.Fernflower

/**
 * A class demonstrating lazy initialization of a property.
 */
class LazyInitialization {
    /**
     * Lazily initialized property `value`.
     *
     * The `value` property is initialized only when it is first accessed.
     * The `lazy` delegate takes a lambda that defines how to initialize the property.
     */
    val value: String by lazy {
        value_delegate()
    }

    /**
     * Function to initialize the `value` property.
     *
     * Prints "Initializing" to the console and returns "Initialized".
     *
     * @return The initialized string.
     */
    private fun value_delegate(): String {
        println("Initializing")
        return "Initialized"
    }
}

/**
 * The main entry point of the application.
 *
 * Demonstrates the usage of the `LazyInitialization` class by accessing the
 * lazily initialized `value` property twice. The initialization message is printed
 * only once, verifying that the property is indeed initialized lazily.
 */
fun main() {
    val instance = LazyInitialization()

    // First access to `value` triggers initialization
    val firstResult = instance.value
    println(firstResult) // Output: Initialized

    // Second access uses the already initialized value
    val secondResult = instance.value
    println(secondResult) // Output: Initialized
}
