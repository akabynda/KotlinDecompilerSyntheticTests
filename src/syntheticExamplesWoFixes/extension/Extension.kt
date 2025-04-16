package syntheticExamplesWoFixes.extension

fun String.greet(): String {
    return "Hello, $this"
}

fun main() {
    println("World".greet())
}
