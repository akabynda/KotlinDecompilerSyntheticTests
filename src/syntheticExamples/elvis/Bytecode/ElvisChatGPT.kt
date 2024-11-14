package syntheticExamples.elvis.Bytecode

fun main() {
    val str: String? = null
    val result = str ?: "Default value"
    println(result)
}
