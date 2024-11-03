package syntheticExamples.scopeFunctions.Fernflower

data class Person(var name: String, var age: Int, var email: String?)

fun main() {
    val person = Person("Unknown", 0, null).apply {
        name = "Alice"
        age = 30
    }
    println("Person's name is ${person.name}")
    println("Name length: ${person.name.length}")
    println("Checking if ${person.name} is adult.")
    println("Is adult: ${person.age >= 18}")
    println("Sending email to ${person.email}")
    person.email = "alice@example.com"
    println("${person.name} can be contacted at ${person.email}")
}
