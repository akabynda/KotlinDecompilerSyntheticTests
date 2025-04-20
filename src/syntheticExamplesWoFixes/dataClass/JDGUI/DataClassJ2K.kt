/*
package syntheticExamplesWoFixes.dataClass.JDGUI

import kotlin.jvm.internal.Intrinsics

class DataClass(val name: String, val age: Int) {
    fun component1(): String {
        return this.name
    }

    fun component2(): Int {
        return this.age
    }

    fun copy(name: String, age: Int): DataClass {
        Intrinsics.checkNotNullParameter(name, "name")
        return DataClass(name, age)
    }

    override fun toString(): String {
        return "DataClass(name=" + this.name + ", age=" + this.age + ')'
    }

    override fun hashCode(): Int {
        result = name.hashCode()
        return result * 31 + Integer.hashCode(this.age)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DataClass) return false
        return Intrinsics.areEqual(this.name, other.name) && (this.age == other.age)
    }
}
/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/dataClass/DataClass.class
 */
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */