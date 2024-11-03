package syntheticExamples.genericsInOutWhere.Fernflower.GenericsInOutWhereJ2K

import kotlin.jvm.internal.Intrinsics

class StringToIntTransformer : Transformer {
    fun transform(value: CharSequence): Int {
        Intrinsics.checkNotNullParameter(value, "value")
        return value.length
    }

    // $FF: synthetic method
    // $FF: bridge method

    // override fun transform(value: Any): Any {
    override fun transform(var1: Any?): Any {
        return this.transform(var1 as CharSequence)
    }
}