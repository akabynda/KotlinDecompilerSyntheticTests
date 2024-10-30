package syntheticExamples.destructuring

data class Point(val x: Int, val y: Int)

fun main() {
    val (x, y) = Point(10, 20)
    println("x = $x, y = $y")
}
