package syntheticExamples.smartCast.Fernflower

fun main() {
    val obj: Any = "String"
    val length: Int = if (obj is String) obj.length else 0
    println(length)
}
