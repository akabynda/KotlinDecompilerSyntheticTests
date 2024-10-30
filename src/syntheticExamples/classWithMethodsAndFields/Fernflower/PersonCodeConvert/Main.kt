package syntheticExamples.classWithMethodsAndFields.Fernflower.PersonCodeConvert

fun main() {
    val person = Person("Alice", 29)
    person.sayHello()
}

// synthetic method
fun main(args: Array<String>) {
    main()
}

