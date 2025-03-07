package syntheticExamples.classWithMethodsAndFields

class Person(private val name: String, private val age: Int) {
    fun sayHello() {
        println("Привет, меня зовут $name")
    }
}

fun main() {
    val person = Person("Alice", 29)
    person.sayHello()
}