package syntheticExamplesWoFixes.operatorOverloading.CFR

import kotlin.jvm.internal.Intrinsics

class Vector(val x: Int, val y: Int) {
    fun plus(other: Vector): Vector {
        Intrinsics.checkNotNullParameter(other as Any, "other")
        return Vector(this.x + other.x, this.y + other.y)
    }

    fun component1(): Int {
        return this.x
    }

    fun component2(): Int {
        return this.y
    }

    fun copy(x: Int, y: Int): Vector {
        return Vector(x, y)
    }

    override fun toString(): String {
        return "Vector(x=" + this.x + ", y=" + this.y + ')'
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
        if (other !is Vector) {
            return false
        }
        val vector = other
        if (this.x != vector.x) {
            return false
        }
        return this.y == vector.y
    }

    companion object {
        fun `copy$default`(vector: Vector, n: Int, n2: Int, n3: Int, `object`: Any?): Vector {
            var n = n
            var n2 = n2
            if ((n3 and 1) != 0) {
                n = vector.x
            }
            if ((n3 and 2) != 0) {
                n2 = vector.y
            }
            return vector.copy(n, n2)
        }
    }
}

object OperatorOverloadingJ2K {
    fun main() {
        val v1 = Vector(1, 2)
        val v2 = Vector(3, 4)
        val v3 = v1.plus(v2)
        println(v3)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}