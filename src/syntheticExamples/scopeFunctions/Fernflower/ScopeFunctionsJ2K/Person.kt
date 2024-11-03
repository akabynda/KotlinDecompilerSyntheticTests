package syntheticExamples.scopeFunctions.Fernflower.ScopeFunctionsJ2K

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000c\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"],
    d2 = ["LsyntheticExamples/scopeFunctions/Person;", "", "name", "", "age", "", "email", "(Ljava/lang/String;ILjava/lang/String;)V", "getAge", "()I", "setAge", "(I)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"]
)
 */
class Person(name: String, age: Int, email: String?) {
    var name: String
    var age: Int
    var email: String?

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        // super()
        this.name = name
        this.age = age
        this.email = email
    }
    /*
    fun getName(): String {
        return this.name
    }

    fun setName(var1: String) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>")
        this.name = var1
    }
     */

    fun component1(): String {
        return this.name
    }

    fun component2(): Int {
        return this.age
    }

    fun component3(): String? {
        return this.email
    }

    fun copy(name: String, age: Int, email: String?): Person {
        Intrinsics.checkNotNullParameter(name, "name")
        return Person(name, age, email)
    }

    override fun toString(): String {
        return "Person(name=" + this.name + ", age=" + this.age + ", email=" + this.email + ')'
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = result * 31 + Integer.hashCode(this.age)
        result = result * 31 + (if (this.email == null) 0 else email.hashCode())
        return result
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        } else if (other !is Person) {
            return false
        } else {
            val var2 = other
            return if (!Intrinsics.areEqual(this.name, var2.name)) {
                false
            } else if (this.age != var2.age) {
                false
            } else {
                Intrinsics.areEqual(this.email, var2.email)
            }
        }
    }

    companion object {
        // $FF: synthetic method
        fun `copy$default`(var0: Person, var1: String, var2: Int, var3: String?, var4: Int, var5: Any?): Person {
            var var1 = var1
            var var2 = var2
            var var3 = var3
            if ((var4 and 1) != 0) {
                var1 = var0.name
            }

            if ((var4 and 2) != 0) {
                var2 = var0.age
            }

            if ((var4 and 4) != 0) {
                var3 = var0.email
            }

            return var0.copy(var1, var2, var3)
        }
    }
}