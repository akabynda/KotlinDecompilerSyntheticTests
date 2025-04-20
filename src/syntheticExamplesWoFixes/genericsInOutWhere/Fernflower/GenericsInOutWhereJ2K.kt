// Transformer.java
package syntheticExamplesWoFixes.genericsInOutWhere.Fernflower

import org.jetbrains.annotations.NotNull
import kotlin.jvm.internal.Intrinsics

interface Transformer {
    fun transform(var1: Any?): Any?
} // StringToIntTransformer.java

class StringToIntTransformer : Transformer {
    @NotNull
    fun transform(@NotNull value: CharSequence): Int {
        Intrinsics.checkNotNullParameter(value, "value")
        return value.length
    }

    // $FF: synthetic method
    // $FF: bridge method
    override fun transform(value: Any?): Any {
        return this.transform(value as CharSequence?)
    }
} // GenericsInOutWhereKt.java

object GenericsInOutWhereKt {
    fun performTransformation(@NotNull value: CharSequence?, @NotNull transformer: Transformer): Any? {
        Intrinsics.checkNotNullParameter(value, "value")
        Intrinsics.checkNotNullParameter(transformer, "transformer")
        return transformer.transform(value)
    }

    fun main() {
        val result = performTransformation(
            "Hello, World!" as CharSequence,
            (StringToIntTransformer())
        ) as Number
        val var2 = "Result: $result"
        println(var2)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}