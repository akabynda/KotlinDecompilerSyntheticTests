package syntheticExamples.elvis

fun main() {
    val str: String? = null
    val result = str ?: "Default value"
    println(result)
}
