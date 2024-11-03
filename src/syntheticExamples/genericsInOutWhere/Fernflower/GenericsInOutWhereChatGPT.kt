package syntheticExamples.genericsInOutWhere.Fernflower

/**
 * A generic Transformer interface that defines a transformation from type T to type R.
 *
 * @param T The input type to be transformed.
 * @param R The output type after transformation.
 */
interface Transformer<T, R> {
    /**
     * Transforms a value of type T into a value of type R.
     *
     * @param value The input value to transform.
     * @return The transformed value.
     */
    fun transform(value: T): R
}

/**
 * A concrete implementation of the Transformer interface that transforms a CharSequence into its length as an Int.
 */
class StringToIntTransformer : Transformer<CharSequence, Int> {
    /**
     * Transforms a CharSequence by returning its length.
     *
     * @param value The CharSequence to transform.
     * @return The length of the CharSequence.
     */
    override fun transform(value: CharSequence): Int {
        return value.length
    }
}

/**
 * Performs a transformation on a given value using the provided transformer.
 *
 * @param value The value to be transformed.
 * @param transformer The transformer to apply to the value.
 * @return The result of the transformation.
 */
fun <T, R> performTransformation(value: T, transformer: Transformer<T, R>): R {
    return transformer.transform(value)
}

/**
 * The main entry point of the application.
 *
 * Demonstrates the usage of generics by transforming a String into its length using the Transformer interface.
 */
fun main() {
    // Create an instance of StringToIntTransformer
    val transformer = StringToIntTransformer()

    // Perform the transformation on the string "Hello, World!"
    val result: Int = performTransformation("Hello, World!", transformer)

    // Print the result to the console
    println("Result: $result")
}
