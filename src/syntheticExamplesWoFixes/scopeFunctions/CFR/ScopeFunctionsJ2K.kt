/*
package syntheticExamplesWoFixes.scopeFunctions.CFR

import kotlin.jvm.internal.Intrinsics
class Person(name: String, age: Int, email: String?) {
    private var name: String
    var age: Int
    var email: String?

    init {
        Intrinsics.checkNotNullParameter(name as Any, "name")
        this.name = name
        this.age = age
        this.email = email
    }

    fun getName(): String {
        return this.name
    }

    fun setName(string: String) {
        Intrinsics.checkNotNullParameter(string as Any, "<set-?>")
        this.name = string
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
        Intrinsics.checkNotNullParameter(name as Any, "name")
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
        }
        if (other !is Person) {
            return false
        }
        val person = other
        if (!Intrinsics.areEqual(name as Any, person.name as Any)) {
            return false
        }
        if (this.age != person.age) {
            return false
        }
        return Intrinsics.areEqual(email as Any?, person.email as Any?)
    }

    companion object {
        fun `copy$default`(person: Person, string: String, n: Int, string2: String?, n2: Int, `object`: Any?): Person {
            var string = string
            var n = n
            var string2 = string2
            if ((n2 and 1) != 0) {
                string = person.name
            }
            if ((n2 and 2) != 0) {
                n = person.age
            }
            if ((n2 and 4) != 0) {
                string2 = person.email
            }
            return person.copy(string, n, string2)
        }
    }
}

object ScopeFunctionsJ2K {
    fun main() {
        val updatedPerson: Person
        var person: Person?
        val person2 =
            (Person("Unknown", 0, null).also { person = it })
        val `$this$main_u24lambda_u240` = person2
        val bl = false
        `$this$main_u24lambda_u240`.name = "Alice"
        `$this$main_u24lambda_u240`.age = 30
        updatedPerson = person2
        var it = updatedPerson
        val bl2 = false
        println(("Person's name is " + it.name) as Any)
        val nameLength = it.name.length
        println(("Name length: $nameLength") as Any)
        val `$this$main_u24lambda_u242` = updatedPerson
        val bl3 = false
        println(("Checking if " + `$this$main_u24lambda_u242`.name + " is adult.") as Any)
        val isAdult = `$this$main_u24lambda_u242`.age >= 18
        println(("Is adult: $isAdult") as Any)
        it = updatedPerson
        val it2 = it
        val bl4 = false
        println(("Sending email to " + it2.email) as Any)
        val `$this$main_u24lambda_u244` = it
        val bl5 = false
        `$this$main_u24lambda_u244`.email = "alice@example.com"
        val `$this$main_u24lambda_u245` = updatedPerson
        val bl6 = false
        val contactInfo = `$this$main_u24lambda_u245`.name + " can be contacted at " + `$this$main_u24lambda_u245`.email
        println(contactInfo as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */