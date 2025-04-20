package syntheticExamplesWoFixes.genericsInOutWhere.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\020\r\n\002\020\b\n\002\b\005\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\005¢\006\002\020\004J\025\020\005\032\0020\0032\006\020\006\032\0020\002H\026¢\006\002\020\007¨\006\b"}, d2 = {"LsyntheticExamplesWoFixes/genericsInOutWhere/StringToIntTransformer;", "LsyntheticExamplesWoFixes/genericsInOutWhere/Transformer;", "", "", "()V", "transform", "value", "(Ljava/lang/CharSequence;)Ljava/lang/Integer;", "KotlinDecompiler"})
public final class StringToIntTransformer implements Transformer<CharSequence, Integer> {
    @NotNull
    public Integer transform(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Integer.valueOf(value.length());
    }
}


/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/genericsInOutWhere/StringToIntTransformer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */