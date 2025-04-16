/*
package syntheticExamplesWoFixes.genericsInOutWhere.CFR

import syntheticExamplesWoFixes.genericsInOutWhere.CFR.Decompilation.StringToIntTransformer
import syntheticExamplesWoFixes.genericsInOutWhere.CFR.Decompilation.Transformer
import kotlin.jvm.internal.Intrinsics

interface Transformer<T, R> {
    fun transform(var1: T): R
}

class StringToIntTransformer : Transformer<CharSequence?, Int?> {
    override fun transform(value: CharSequence): Int {
        Intrinsics.checkNotNullParameter(value as Any, "value")
        return value.length
    }
}

object GenericsInOutWhereJ2K {
    fun <T : CharSequence?, R> performTransformation(value: T, transformer: Transformer<in T?, out R>): R {
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
 */