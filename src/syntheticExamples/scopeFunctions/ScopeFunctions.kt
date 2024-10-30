package syntheticExamples.scopeFunctions

data class Person(var name: String, var age: Int, var email: String?)

fun main() {
    val person = Person("Unknown", 0, null)

    val updatedPerson = person.apply {
        name = "Alice"
        age = 30
    }

    val nameLength = updatedPerson.let {
        println("Person's name is ${it.name}")
        it.name.length
    }
    println("Name length: $nameLength")

    val isAdult = updatedPerson.run {
        println("Checking if $name is adult.")
        age >= 18
    }
    println("Is adult: $isAdult")

    updatedPerson.also {
        println("Sending email to ${it.email}")
    }.apply {
        email = "alice@example.com"
    }

    val contactInfo = with(updatedPerson) {
        "$name can be contacted at $email"
    }
    println(contactInfo)
}
