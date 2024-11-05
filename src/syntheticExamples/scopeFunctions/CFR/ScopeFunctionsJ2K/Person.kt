package syntheticExamples.scopeFunctions.CFR.ScopeFunctionsJ2K

import kotlin.jvm.internal.Intrinsics

class Person(name: String, age: Int, email: String?) {
    var name: String
    var age: Int
    var email: String?

    init {
        Intrinsics.checkNotNullParameter(name as Any, "name")
        this.name = name
        this.age = age
        this.email = email
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