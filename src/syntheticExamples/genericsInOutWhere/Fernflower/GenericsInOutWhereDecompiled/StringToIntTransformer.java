package syntheticExamples.genericsInOutWhere.Fernflower.GenericsInOutWhereDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0007¨\u0006\b"},
        d2 = {"LsyntheticExamples/genericsInOutWhere/Fernflower/GenericsInOutWhereDecompiled/StringToIntTransformer;", "LsyntheticExamples/genericsInOutWhere/Fernflower/GenericsInOutWhereDecompiled/Transformer;", "", "", "()V", "transform", "value", "(Ljava/lang/CharSequence;)Ljava/lang/Integer;", "KotlinDecompiler"}
)
public final class StringToIntTransformer implements Transformer {
    @NotNull
    public Integer transform(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.length();
    }

    // $FF: synthetic method
    // $FF: bridge method
    public Object transform(Object value) {
        return this.transform((CharSequence)value);
    }
}