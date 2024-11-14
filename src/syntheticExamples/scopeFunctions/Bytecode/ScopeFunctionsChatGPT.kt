package syntheticExamples.scopeFunctions.Bytecode

data class Person(var name: String, var age: Int, var email: String?)
/*
{
    fun copy(name: String = this.name, age: Int = this.age, email: String? = this.email) =
        Person(name, age, email)
}
 */

fun main() {
    val person = Person("Unknown", 0, null).apply {
        name = "Alice"
        age = 30
    }

    person.let {
        println("Person's name is ${it.name}")
    }

    val isAdult = person.run {
        age >= 18
    }
    println("Is adult: $isAdult")

    person.also {
        it.email = "alice@example.com"
        println("Sending email to ${it.email}")
    }

    with(person) {
        val contactInfo = "$name can be contacted at $email"
        println(contactInfo)
    }
}
