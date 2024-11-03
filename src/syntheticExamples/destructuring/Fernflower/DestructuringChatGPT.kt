package syntheticExamples.destructuring.Fernflower

data class Point(
    val x: Int,
    val y: Int
)

fun main() {
    val point = Point(10, 20)

    // Using destructuring declarations
    val (x, y) = point
    println("x = $x, y = $y")

    // Alternatively, accessing component functions directly
    // val x = point.component1()
    // val y = point.component2()
    // println("x = $x, y = $y")
}