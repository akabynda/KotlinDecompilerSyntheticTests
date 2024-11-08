package syntheticExamples.genericsInOutWhere.JDGUI.GenericsInOutWhereJ2K

import kotlin.jvm.internal.Intrinsics

class StringToIntTransformer :
    Transformer<CharSequence?, Int?> {
    override fun transform(paramT: CharSequence?): Int {
        Intrinsics.checkNotNullParameter(paramT, "paramT")
        return paramT?.length ?: 0
    }
}