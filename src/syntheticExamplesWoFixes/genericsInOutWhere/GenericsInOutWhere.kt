package syntheticExamplesWoFixes.genericsInOutWhere

interface Transformer<in T, out R> {
    fun transform(value: T): R
}

class StringToIntTransformer : Transformer<CharSequence, Int> {
    override fun transform(value: CharSequence): Int {
        return value.length
    }
}

fun <T, R> performTransformation(value: T, transformer: Transformer<T, R>): R where T : CharSequence {
    return transformer.transform(value)
}

fun main() {
    val transformer: Transformer<CharSequence, Number> = StringToIntTransformer()
    val result = performTransformation("Hello, World!", transformer)
    println("Result: $result")
}
