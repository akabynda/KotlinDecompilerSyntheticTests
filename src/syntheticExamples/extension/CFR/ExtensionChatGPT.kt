package syntheticExamples.extension.CFR

fun String.greet(): String {
    return "Hello, $this"
}

fun main() {
    println("World".greet())
}
