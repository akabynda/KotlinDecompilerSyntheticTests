package syntheticExamples.smartCast.JDGUI

fun main() {
    val obj: Any = "String"
    val i = (obj as String).length
    println(i)
}
