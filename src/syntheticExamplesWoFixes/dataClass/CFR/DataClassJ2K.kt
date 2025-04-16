package syntheticExamplesWoFixes.dataClass.CFR

import kotlin.jvm.internal.Intrinsics

class DataClassJ2K(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        Intrinsics.checkNotNullParameter(name as Any, "name")
        this.name = name
        this.age = age
    }

    fun component1(): String {
        return this.name
    }

    fun component2(): Int {
        return this.age
    }

    fun copy(name: String, age: Int): DataClassJ2K {
        Intrinsics.checkNotNullParameter(name as Any, "name")
        return DataClassJ2K(name, age)
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
        }
        if (other !is DataClassJ2K) {
            return false
        }
        val dataClass = other
        if (!Intrinsics.areEqual(name as Any, dataClass.name as Any)) {
            return false
        }
        return this.age == dataClass.age
    }

    companion object {
        fun `copy$default`(dataClass: DataClassJ2K, string: String, n: Int, n2: Int, `object`: Any?): DataClassJ2K {
            var string = string
            var n = n
            if ((n2 and 1) != 0) {
                string = dataClass.name
            }
            if ((n2 and 2) != 0) {
                n = dataClass.age
            }
            return dataClass.copy(string, n)
        }
    }
}