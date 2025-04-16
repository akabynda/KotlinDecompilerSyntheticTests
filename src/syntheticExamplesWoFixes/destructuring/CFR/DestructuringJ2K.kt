package syntheticExamplesWoFixes.destructuring.CFR

object DestructuringJ2K {
    fun main() {
        val point = Point(10, 20)
        val x = point.component1()
        val y = point.component2()
        println(("x = $x, y = $y") as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}

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
        var result = Integer.hashCode(this.x)
        result = result * 31 + Integer.hashCode(this.y)
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other !is Point) {
            return false
        }
        val point = other
        if (this.x != point.x) {
            return false
        }
        return this.y == point.y
    }

    companion object {
        fun `copy$default`(point: Point, n: Int, n2: Int, n3: Int, `object`: Any?): Point {
            var n = n
            var n2 = n2
            if ((n3 and 1) != 0) {
                n = point.x
            }
            if ((n3 and 2) != 0) {
                n2 = point.y
            }
            return point.copy(n, n2)
        }
    }
}