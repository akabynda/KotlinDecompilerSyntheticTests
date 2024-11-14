package syntheticExamples.safeCast.Bytecode

fun main() {
    val obj: Any = "String"
    val num: Int? = obj as? Int
    println(num)
}
