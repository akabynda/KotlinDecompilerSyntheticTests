package syntheticExamples.genericsInOutWhere.CFR.GenericsInOutWhereDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000\u001a\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a7\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u0002H\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0006\u00a2\u0006\u0002\u0010\u0007\u001a\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2={"performTransformation", "R", "T", "", "value", "transformer", "LsyntheticExamples/genericsInOutWhere/Transformer;", "(Ljava/lang/CharSequence;LsyntheticExamples/genericsInOutWhere/Transformer;)Ljava/lang/Object;", "main", "", "KotlinDecompiler"})
public final class GenericsInOutWhereKt {
    public static final <T extends CharSequence, R> R performTransformation(@NotNull T value, @NotNull Transformer<? super T, ? extends R> transformer) {
        Intrinsics.checkNotNullParameter(value, (String)"value");
        Intrinsics.checkNotNullParameter(transformer, (String)"transformer");
        return transformer.transform(value);
    }

    public static final void main() {
        Transformer transformer = new StringToIntTransformer();
        Number result = (Number)GenericsInOutWhereKt.performTransformation((CharSequence)"Hello, World!", transformer);
        System.out.println((Object)("Result: " + result));
    }

    public static /* synthetic */ void main(String[] args) {
        GenericsInOutWhereKt.main();
    }
}
