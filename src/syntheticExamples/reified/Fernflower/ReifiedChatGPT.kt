package syntheticExamples.reified.Fernflower

inline fun <reified T> getTypeName(): String {
    return T::class.java.simpleName
}

fun main() {
    println(getTypeName<String>())
}
