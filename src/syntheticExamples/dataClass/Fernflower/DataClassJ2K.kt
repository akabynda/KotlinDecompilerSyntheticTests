package syntheticExamples.dataClass.Fernflower

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000c\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"],
    d2 = ["LsyntheticExamples/dataClass/DataClass;", "", "name", "", "age", "", "(Ljava/lang/String;I)V", "getAge", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"]
)
 */
class DataClassJ2K(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        // super()
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
        Intrinsics.checkNotNullParameter(name, "name")
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
        } else if (other !is DataClassJ2K) {
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
        fun `copy$default`(
            var0: DataClassJ2K,
            var1: String,
            var2: Int,
            var3: Int,
            var4: Any?
        ): DataClassJ2K {
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
