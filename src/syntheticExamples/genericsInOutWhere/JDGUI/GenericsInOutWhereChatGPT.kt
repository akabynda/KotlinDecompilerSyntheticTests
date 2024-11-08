package syntheticExamples.genericsInOutWhere.JDGUI

interface Transformer<in T, out R> {
    fun transform(value: T): R
}

class StringToIntTransformer : Transformer<CharSequence, Int> {
    override fun transform(value: CharSequence): Int {
        return value.length
    }
}

fun <T : CharSequence, R> performTransformation(value: T, transformer: Transformer<T, R>): R {
    return transformer.transform(value)
}

fun main() {
    val transformer: Transformer<CharSequence, Number> = StringToIntTransformer()
    val result = performTransformation("Hello, World!", transformer)
    println("Result: $result")
}
