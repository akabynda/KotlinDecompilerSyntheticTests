/*
package syntheticExamplesWoFixes.genericsInOutWhere.JDGUI

import kotlin.jvm.internal.Intrinsics

interface Transformer<T, R> {
    fun transform(paramT: T): R
}

class StringToIntTransformer :
    Transformer<CharSequence?, Int?> {
    override fun transform(value: CharSequence): Int {
        Intrinsics.checkNotNullParameter(value, "value")
        return value.length
    }
}

object GenericsInOutWhereKt {
    fun <T : CharSequence?, R> performTransformation(
        value: CharSequence,
        transformer: Transformer<CharSequence?, R>
    ): R {
        Intrinsics.checkNotNullParameter(value, "value")
        Intrinsics.checkNotNullParameter(transformer, "transformer")
        return transformer.transform(value)
    }

    fun main() {
        val transformer: Transformer<in CharSequence?, out Number> = StringToIntTransformer()
        val result: Number = performTransformation<T, R>("Hello, World!", transformer)
        println("Result: $result")
    }
}
 */