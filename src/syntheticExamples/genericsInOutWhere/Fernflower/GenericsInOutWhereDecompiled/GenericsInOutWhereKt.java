package syntheticExamples.genericsInOutWhere.Fernflower.GenericsInOutWhereDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a7\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0006\u001a\u0002H\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\b¢\u0006\u0002\u0010\t¨\u0006\n"},
        d2 = {"main", "", "performTransformation", "R", "T", "", "value", "transformer", "LsyntheticExamples/genericsInOutWhere/Fernflower/GenericsInOutWhereDecompiled/Transformer;", "(Ljava/lang/CharSequence;LsyntheticExamples/genericsInOutWhere/Fernflower/GenericsInOutWhereDecompiled/Transformer;)Ljava/lang/Object;", "KotlinDecompiler"}
)
public final class GenericsInOutWhereKt {
    public static Object performTransformation(@NotNull CharSequence value, @NotNull Transformer transformer) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        return transformer.transform(value);
    }

    public static void main() {
        Transformer transformer = new StringToIntTransformer();
        Number result = (Number) performTransformation("Hello, World!", transformer);
        String var2 = "Result: " + result;
        System.out.println(var2);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}