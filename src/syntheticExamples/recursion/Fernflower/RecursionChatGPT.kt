package syntheticExamples.recursion.Fernflower

/**
 * Calculates the factorial of a given number using recursion.
 *
 * @param n The number for which the factorial is to be calculated.
 * @return The factorial of the number `n`.
 * @throws IllegalArgumentException if `n` is negative.
 */
fun factorial(n: Int): Int {
    require(n >= 0) { "Factorial is not defined for negative numbers." }
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}

/**
 * The main entry point of the application.
 *
 * Demonstrates the usage of the recursive `factorial` function by calculating
 * the factorial of 5 and printing the result.
 */
fun main() {
    val number = 5
    val result = factorial(number)
    println("Factorial of $number is $result")
}
