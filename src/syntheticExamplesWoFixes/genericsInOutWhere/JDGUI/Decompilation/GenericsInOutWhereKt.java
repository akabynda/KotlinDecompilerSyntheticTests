/*
package syntheticExamplesWoFixes.genericsInOutWhere.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\020\002\n\002\b\003\n\002\020\r\n\002\b\002\n\002\030\002\n\002\b\002\032\006\020\000\032\0020\001\0327\020\002\032\002H\003\"\b\b\000\020\004*\0020\005\"\004\b\001\020\0032\006\020\006\032\002H\0042\022\020\007\032\016\022\004\022\002H\004\022\004\022\002H\0030\b¢\006\002\020\t¨\006\n"}, d2 = {"main", "", "performTransformation", "R", "T", "", "value", "transformer", "LsyntheticExamplesWoFixes/genericsInOutWhere/Transformer;", "(Ljava/lang/CharSequence;LsyntheticExamplesWoFixes/genericsInOutWhere/Transformer;)Ljava/lang/Object;", "KotlinDecompiler"})
public final class GenericsInOutWhereKt {
    public static <T extends CharSequence, R> R performTransformation(@NotNull CharSequence value, @NotNull Transformer<CharSequence, R> transformer) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        return transformer.transform(value);
    }

    public static void main() {
        Transformer<? super CharSequence, ? extends Number> transformer = new StringToIntTransformer();
        Number result = performTransformation("Hello, World!", transformer);
        System.out.println("Result: " + result);
    }
}
 */


/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/genericsInOutWhere/GenericsInOutWhereKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */