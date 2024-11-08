package syntheticExamples.destructuring.JDGUI.DestructuringJ2K

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
        val result = Integer.hashCode(this.x)
        return result * 31 + Integer.hashCode(this.y)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Point) return false
        val point = other
        return if ((this.x != point.x)) false else (this.y == point.y)
    }
}