/*
package syntheticExamplesWoFixes.dataClass.Fernflower

import kotlin.jvm.internal.Intrinsics

class DataClass(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        super()
        this.name = name
        this.age = age
    }

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
        var result = name.hashCode()
        result = result * 31 + Integer.hashCode(this.age)
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        } else if (other !is DataClass) {
            return false
        } else {
            val var2 = other
            return if (!Intrinsics.areEqual(this.name, var2.name)) {
                false
            } else {
                age == var2.age
            }
        }
    }

    companion object {
        // $FF: synthetic method
        fun `copy$default`(var0: DataClass, var1: String, var2: Int, var3: Int, var4: Any?): DataClass {
            var var1 = var1
            var var2 = var2
            if ((var3 and 1) != 0) {
                var1 = var0.name
            }

            if ((var3 and 2) != 0) {
                var2 = var0.age
            }

            return var0.copy(var1, var2)
        }
    }
}
 */