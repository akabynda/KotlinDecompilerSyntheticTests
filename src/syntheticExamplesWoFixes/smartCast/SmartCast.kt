package syntheticExamplesWoFixes.smartCast

fun main() {
    val obj: Any = "String"
    if (obj is String) {
        println(obj.length)
    }
}
