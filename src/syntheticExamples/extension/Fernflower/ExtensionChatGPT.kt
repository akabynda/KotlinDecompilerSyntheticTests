package syntheticExamples.extension.Fernflower

fun String.greet(): String {
    return "Hello, $this"
}

fun main() {
    val name = "World"
    val greeting = name.greet()
    println(greeting)
}
