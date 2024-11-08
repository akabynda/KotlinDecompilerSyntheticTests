package syntheticExamples.dataClass.JDGUI

import kotlin.jvm.internal.Intrinsics

class DataClassJ2K(val name: String, val age: Int) {
    fun component1(): String {
        return this.name
    }

    fun component2(): Int {
        return this.age
    }

    fun copy(name: String, age: Int): DataClassJ2K {
        Intrinsics.checkNotNullParameter(name, "name")
        return DataClassJ2K(name, age)
    }

    override fun toString(): String {
        return "DataClassJ2K(name=" + this.name + ", age=" + this.age + ')'
    }

    override fun hashCode(): Int {
        val result = name.hashCode()
        return result * 31 + Integer.hashCode(this.age)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DataClassJ2K) return false
        val dataClass = other
        return if (!Intrinsics.areEqual(this.name, dataClass.name)) false else (this.age == dataClass.age)
    }
}