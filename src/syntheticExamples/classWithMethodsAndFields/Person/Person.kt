package syntheticExamples.classWithMethodsAndFields.Person

class Person(private val name: String, private val age: Int) {
    fun sayHello() {
        println("Привет, меня зовут $name")
    }
}