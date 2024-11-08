package syntheticExamples.scopeFunctions.JDGUI.ScopeFunctionsJ2K

import kotlin.jvm.internal.Intrinsics

class Person(var name: String, var age: Int, var email: String?) {

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
        return result * 31 + (if ((this.email == null)) 0 else email.hashCode())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Person) return false
        val person = other
        return if (!Intrinsics.areEqual(
                this.name,
                person.name
            )
        ) false else (if ((this.age != person.age)) false else (!!Intrinsics.areEqual(
            this.email, person.email
        )))
    }
}