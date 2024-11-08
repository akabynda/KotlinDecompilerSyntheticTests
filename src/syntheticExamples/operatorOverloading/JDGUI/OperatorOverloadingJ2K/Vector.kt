package syntheticExamples.operatorOverloading.JDGUI.OperatorOverloadingJ2K

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
        val result = Integer.hashCode(this.x)
        return result * 31 + Integer.hashCode(this.y)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Vector) return false
        val vector = other
        return if ((this.x != vector.x)) false else (this.y == vector.y)
    }
}
