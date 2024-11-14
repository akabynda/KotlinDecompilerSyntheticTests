package syntheticExamples.smartCast.Bytecode

fun main() {
    val obj: Any = "String"
    val length = (obj as String).length
    println(length)
}
