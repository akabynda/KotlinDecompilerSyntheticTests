package syntheticExamples.genericsInOutWhere.Fernflower.GenericsInOutWhereJ2K

import kotlin.jvm.internal.Intrinsics

object GenericsInOutWhere {
    fun performTransformation(value: CharSequence, transformer: Transformer): Any? {
        Intrinsics.checkNotNullParameter(value, "value")
        Intrinsics.checkNotNullParameter(transformer, "transformer")
        return transformer.transform(value)
    }

    fun main() {
        val transformer = (StringToIntTransformer()) as Transformer
        val result = performTransformation("Hello, World!" as CharSequence, transformer) as Number
        val var2 = "Result: $result"
        println(var2)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}