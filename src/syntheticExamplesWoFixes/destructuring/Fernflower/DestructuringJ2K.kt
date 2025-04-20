// Point.java
package syntheticExamplesWoFixes.destructuring.Fernflower

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
        } else if (other !is Point) {
            return false
        } else {
            val var2 = other
            return if (this.x != var2.x) {
                false
            } else {
                y == var2.y
            }
        }
    }

    companion object {
        // $FF: synthetic method
        fun `copy$default`(var0: Point, var1: Int, var2: Int, var3: Int, var4: Any?): Point {
            var var1 = var1
            var var2 = var2
            if ((var3 and 1) != 0) {
                var1 = var0.x
            }

            if ((var3 and 2) != 0) {
                var2 = var0.y
            }

            return var0.copy(var1, var2)
        }
    }
} // DestructuringKt.java

object DestructuringKt {
    fun main() {
        val var0 = Point(10, 20)
        val x = var0.component1()
        val y = var0.component2()
        val var3 = "x = $x, y = $y"
        println(var3)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}