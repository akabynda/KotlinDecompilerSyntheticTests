package syntheticExamples.dataClass.CFR

import kotlin.jvm.internal.Intrinsics
/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 82,
    d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"],
    d2 = ["LsyntheticExamples/dataClass/DataClassJ2K;", "", "name", "", "age", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getAge", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"]
)
 */
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
        return "DataClassJ2K(name=" + this.name + ", age=" + this.age + ')'
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
        fun `copy$default`(
            dataClass: DataClassJ2K,
            string: String,
            n: Int,
            n2: Int,
            `object`: Any?
        ): DataClassJ2K {
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