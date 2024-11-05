package syntheticExamples.genericsInOutWhere.CFR.GenericsInOutWhereJ2K

import kotlin.jvm.internal.Intrinsics

class StringToIntTransformer

    : Transformer<CharSequence?, Int?> {
    override fun transform(var1: CharSequence): Int {
        Intrinsics.checkNotNullParameter(var1 as Any, "value")
        return var1.length
    }
}