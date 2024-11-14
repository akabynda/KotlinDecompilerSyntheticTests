package syntheticExamples.reified.Bytecode

inline fun <reified T> getTypeName(): String {
    return T::class.java.simpleName
}

fun main() {
    val typeName = getTypeName<String>()
    println(typeName)
}
