package syntheticExamples.scopeFunctions.JDGUI

data class Person(
    var name: String,
    var age: Int,
    var email: String?
)

fun main() {
    val person = Person("Unknown", 0, null).apply {
        name = "Alice"
        age = 30
    }

    println("Person's name is ${person.name}")
    val nameLength = person.name.length
    println("Name length: $nameLength")

    println("Checking if ${person.name} is adult.")
    val isAdult = person.age >= 18
    println("Is adult: $isAdult")

    println("Sending email to ${person.email}")
    person.email = "alice@example.com"
    val contactInfo = "${person.name} can be contacted at ${person.email}"
    println(contactInfo)
}
