package syntheticExamples.scopeFunctions.CFR

data class Person(var name: String, var age: Int, var email: String?)

fun main() {
    val person = Person("Unknown", 0, null).apply {
        name = "Alice"
        age = 30
    }

    person.let {
        println("Person's name is ${it.name}")
        val nameLength = it.name.length
        println("Name length: $nameLength")
    }

    person.run {
        println("Checking if $name is adult.")
        val isAdult = age >= 18
        println("Is adult: $isAdult")
    }

    person.also {
        println("Sending email to ${it.email}")
    }.apply {
        email = "alice@example.com"
    }

    with(person) {
        val contactInfo = "$name can be contacted at $email"
        println(contactInfo)
    }
}
