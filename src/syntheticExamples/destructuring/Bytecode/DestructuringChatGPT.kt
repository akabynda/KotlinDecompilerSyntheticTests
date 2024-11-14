package syntheticExamples.destructuring.Bytecode

data class Point(val x: Int, val y: Int)

fun main() {
    val point = Point(10, 20)
    val (x, y) = point
    println("x = $x, y = $y")
}
