/*
// Person.java
package syntheticExamplesWoFixes.classWithMethodsAndFields.Fernflower

import kotlin.jvm.internal.Intrinsics

class Person(name: String, age: Int) {
    private val name: String
    private val age: Int

    init {
        Intrinsics.checkNotNullParameter(name, "name")
        super()
        this.name = name
        this.age = age
    }

    fun sayHello() {
        val var1 = "Привет, меня зовут " + this.name
        println(var1)
    }
} // PersonKt.java


object PersonKt {
    fun main() {
        val person = Person("Alice", 29)
        person.sayHello()
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */