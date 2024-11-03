package syntheticExamples.higherOrderFunction.Fernflower

fun main() {
    // Define a lambda function that squares an integer
    val square: (Int) -> Int = { it * it }

    // Invoke the lambda function with the value 5
    val result = square(5)

    // Print the result
    println(result)
}
