package syntheticExamples.destructuring.JDGUI.DestructuringJ2K

object Destructuring {
    fun main() {
        val point = Point(10, 20)
        val x = point.component1()
        val y = point.component2()
        println("x = $x, y = $y")
    }
}
