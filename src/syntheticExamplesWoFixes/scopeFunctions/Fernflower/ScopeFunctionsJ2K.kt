/*
// Person.java
package syntheticExamplesWoFixes.scopeFunctions.Fernflower

import kotlin.jvm.internal.Intrinsics

class Person(name: String, age: Int, email: String?) {
    private var name: String
    var age: Int
    var email: String?

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        super()
        this.name = name
        this.age = age
        this.email = email
    }

    fun getName(): String {
        return this.name
    }

    fun setName(var1: String) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>")
        this.name = var1
    }

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
} // ScopeFunctionsKt.java

@Metadata(
    mv = [1, 9, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)
object ScopeFunctionsKt {
    fun main() {
        val person = Person("Unknown", 0, null as String?)
        val `$this$main_u24lambda_u240` = person
        val var4: Int = false.toInt()
        `$this$main_u24lambda_u240`.setName("Alice")
        `$this$main_u24lambda_u240`.setAge(30)
        val updatedPerson = person
        val it = updatedPerson
        val var5: Int = false.toInt()
        val var6 = "Person's name is " + it.getName()
        println(var6)
        val nameLength: Int = it.getName().length
        val var8 = "Name length: $nameLength"
        println(var8)
        var `$this$main_u24lambda_u245` = updatedPerson
        var var13: Int = false.toInt()
        var var7 = "Checking if " + `$this$main_u24lambda_u245`.getName() + " is adult."
        println(var7)
        val isAdult: Boolean = `$this$main_u24lambda_u245`.getAge() >= 18
        var contactInfo = "Is adult: $isAdult"
        println(contactInfo)
        `$this$main_u24lambda_u245` = updatedPerson
        var13 = false.toInt()
        var7 = "Sending email to " + `$this$main_u24lambda_u245`.getEmail()
        println(var7)
        `$this$main_u24lambda_u245` = updatedPerson
        var13 = false.toInt()
        `$this$main_u24lambda_u245`.setEmail("alice@example.com")
        `$this$main_u24lambda_u245` = updatedPerson
        var13 = false.toInt()
        contactInfo =
            `$this$main_u24lambda_u245`.getName() + " can be contacted at " + `$this$main_u24lambda_u245`.getEmail()
        println(contactInfo)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */