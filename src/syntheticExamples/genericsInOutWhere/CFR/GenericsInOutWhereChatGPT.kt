package syntheticExamples.genericsInOutWhere.CFR

interface Transformer<T, R> {
    fun transform(value: T): R
}

class StringToIntTransformer : Transformer<CharSequence, Int> {
    override fun transform(value: CharSequence): Int {
        return value.length
    }
}

fun <T : CharSequence, R> performTransformation(value: T, transformer: Transformer<in T, out R>): R {
    return transformer.transform(value)
}

fun main() {
    val transformer = StringToIntTransformer()
    val result: Number = performTransformation("Hello, World!", transformer)
    println("Result: $result")
}
