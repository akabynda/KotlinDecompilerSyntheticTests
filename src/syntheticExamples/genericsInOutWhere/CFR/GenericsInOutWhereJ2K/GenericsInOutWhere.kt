package syntheticExamples.genericsInOutWhere.CFR.GenericsInOutWhereJ2K

import kotlin.jvm.internal.Intrinsics

object GenericsInOutWhere {
    fun <T : CharSequence, R> performTransformation(value: T, transformer: Transformer<*, *>): Any? {
        Intrinsics.checkNotNullParameter(value, "value")
        Intrinsics.checkNotNullParameter(transformer, "transformer")
        return transformer.transform(value)
    }

    fun main() {
        val transformer: Transformer<*, *> = StringToIntTransformer()
        val result = performTransformation<CharSequence, Any>("Hello, World!" as CharSequence, transformer) as Number
        println(("Result: $result") as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}