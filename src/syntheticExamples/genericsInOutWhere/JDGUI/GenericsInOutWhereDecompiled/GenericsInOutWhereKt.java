package syntheticExamples.genericsInOutWhere.JDGUI.GenericsInOutWhereDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\032\n\002\b\003\n\002\020\r\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\0327\020\000\032\002H\001\"\b\b\000\020\002*\0020\003\"\004\b\001\020\0012\006\020\004\032\002H\0022\022\020\005\032\016\022\004\022\002H\002\022\004\022\002H\0010\006\006\002\020\007\032\006\020\b\032\0020\t\006\n"}, d2 = {"performTransformation", "R", "T", "", "value", "transformer", "LsyntheticExamples/genericsInOutWhere/Transformer;", "(Ljava/lang/CharSequence;LsyntheticExamples/genericsInOutWhere/Transformer;)Ljava/lang/Object;", "main", "", "KotlinDecompiler"})
public final class GenericsInOutWhereKt {
    public static final <T extends CharSequence, R> R performTransformation(@NotNull CharSequence value, @NotNull Transformer<CharSequence, R> transformer) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        return transformer.transform(value);
    }

    public static final void main() {
        Transformer<? super CharSequence, ? extends Number> transformer = new StringToIntTransformer();
        Number result = performTransformation("Hello, World!", (Transformer<CharSequence, Number>) transformer);
        System.out.println("Result: " + result);
    }
}
