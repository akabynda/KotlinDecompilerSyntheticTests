package syntheticExamples.genericsInOutWhere.JDGUI.GenericsInOutWhereDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\020\r\n\002\020\b\n\002\b\006\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\007\006\004\b\004\020\005J\025\020\006\032\0020\0032\006\020\007\032\0020\002H\026\006\002\020\b\006\t"}, d2 = {"LsyntheticExamples/genericsInOutWhere/StringToIntTransformer;", "LsyntheticExamples/genericsInOutWhere/Transformer;", "", "", "<init>", "()V", "transform", "value", "(Ljava/lang/CharSequence;)Ljava/lang/Integer;", "KotlinDecompiler"})
public final class StringToIntTransformer implements Transformer<CharSequence, Integer> {
    @NotNull
    public Integer transform(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Integer.valueOf(value.length());
    }
}
