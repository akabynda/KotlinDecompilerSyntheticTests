package syntheticExamples.operatorOverloading.Fernflower.OperatorOverloadingJ2K

import kotlin.jvm.internal.Intrinsics

class Vector(val x: Int, val y: Int) {
    fun plus(other: Vector): Vector {
        Intrinsics.checkNotNullParameter(other, "other")
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
        } else if (other !is Vector) {
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
        fun `copy$default`(var0: Vector, var1: Int, var2: Int, var3: Int, var4: Any?): Vector {
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
