package syntheticExamples.operatorOverloading.Fernflower

/**
 * A data class representing a 2D vector with x and y coordinates.
 *
 * @property x The x-coordinate of the vector.
 * @property y The y-coordinate of the vector.
 */
data class Vector(val x: Int, val y: Int) {
    /**
     * Overloads the `+` operator to add two vectors.
     *
     * @param other The other vector to add.
     * @return A new Vector instance representing the sum of the two vectors.
     */
    operator fun plus(other: Vector): Vector {
        return Vector(this.x + other.x, this.y + other.y)
    }
}

/**
 * The main entry point of the application.
 *
 * Demonstrates the usage of the `Vector` class and the overloaded `+` operator.
 */
fun main() {
    // Creating two Vector instances
    val v1 = Vector(1, 2)
    val v2 = Vector(3, 4)

    // Adding the two vectors using the overloaded `+` operator
    val v3 = v1 + v2

    // Printing the result
    println(v3)
}
