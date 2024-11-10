package syntheticExamples.safeCast.CFR

fun main() {
    val obj: Any = "String"
    val num = obj as? Int
    println(num)
}
