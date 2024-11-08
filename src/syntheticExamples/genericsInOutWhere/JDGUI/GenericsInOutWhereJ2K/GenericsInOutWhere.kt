package syntheticExamples.genericsInOutWhere.JDGUI.GenericsInOutWhereJ2K

import kotlin.jvm.internal.Intrinsics

object GenericsInOutWhere {
    fun <T : CharSequence?, R> performTransformation(
        value: CharSequence,
        transformer: Transformer<CharSequence?, R>
    ): R {
        Intrinsics.checkNotNullParameter(value, "value")
        Intrinsics.checkNotNullParameter(transformer, "transformer")
        return transformer.transform(value)
    }

    fun main() {
        val transformer: StringToIntTransformer = StringToIntTransformer()
        val result = performTransformation<CharSequence, Number>(
            "Hello, World!",
            transformer as Transformer<CharSequence?, Number>
        )
        println("Result: $result")
    }
}
