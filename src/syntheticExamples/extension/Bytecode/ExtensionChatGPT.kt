package syntheticExamples.extension.Bytecode

fun String.greet(): String {
    return "Hello, $this"
}

fun main() {
    val result = "World".greet()
    println(result)
}
