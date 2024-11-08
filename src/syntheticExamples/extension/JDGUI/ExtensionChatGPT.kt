package syntheticExamples.extension.JDGUI

fun String.greet(): String {
    return "Hello, $this"
}

fun main() {
    println("World".greet())
}
