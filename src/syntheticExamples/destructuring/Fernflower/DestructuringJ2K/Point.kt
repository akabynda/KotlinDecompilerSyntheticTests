package syntheticExamples.destructuring.Fernflower.DestructuringJ2K

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000c\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"],
    d2 = ["LsyntheticExamples/destructuring/Point;", "", "x", "", "y", "(II)V", "getX", "()I", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "KotlinDecompiler"]
)
 */
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
}