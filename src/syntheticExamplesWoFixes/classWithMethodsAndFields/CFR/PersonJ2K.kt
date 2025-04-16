package syntheticExamplesWoFixes.classWithMethodsAndFields.CFR

import kotlin.jvm.internal.Intrinsics

class Person(name: String, age: Int) {
    private val name: String
    private val age: Int

    init {
        Intrinsics.checkNotNullParameter(name as Any, "name")
        this.name = name
        this.age = age
    }

    fun sayHello() {
        println(("\u041f\u0440\u0438\u0432\u0435\u0442, \u043c\u0435\u043d\u044f \u0437\u043e\u0432\u0443\u0442 " + this.name) as Any)
    }
}

object PersonJ2K {
    fun main() {
        val person = Person("Alice", 29)
        person.sayHello()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}