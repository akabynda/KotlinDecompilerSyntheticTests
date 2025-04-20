package syntheticExamplesWoFixes.classWithMethodsAndFields.JDGUI

class Person(private val name: String, private val age: Int) {
    fun sayHello() {
        println("Привет, меня зовут " + this.name)
    }
}

object PersonJ2K {
    fun main() {
        val person = Person("Alice", 29)
        person.sayHello()
    }
}

fun main() {
    PersonJ2K.main()
}