package syntheticExamples.smartCast.CFR

fun main() {
    val obj: Any = "String"
    if (obj is String) {
        val n = obj.length
        println(n)
    }
}
