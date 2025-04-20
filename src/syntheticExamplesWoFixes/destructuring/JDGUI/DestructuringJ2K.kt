/*
package syntheticExamplesWoFixes.destructuring.JDGUI

class Point(val x: Int, val y: Int) {
    fun component1(): Int {
        return this.x
    }

    fun component2(): Int {
        return this.y
    }

    fun copy(x: Int, y: Int): Point {
        return Point(x, y)
    }

    override fun toString(): String {
        return "Point(x=" + this.x + ", y=" + this.y + ')'
    }

    override fun hashCode(): Int {
        result = Integer.hashCode(this.x)
        return result * 31 + Integer.hashCode(this.y)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false
        return this.x == other.x && (this.y == other.y)
    }
}

object DestructuringJ2K {
    fun main() {
        val point = Point(10, 20)
        val x = point.component1()
        val y = point.component2()
        println("x = $x, y = $y")
    }
}
 */