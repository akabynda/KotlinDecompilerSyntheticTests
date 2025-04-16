/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package syntheticExamplesWoFixes.genericsInOutWhere.CFR.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a7\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0004*\u00020\u0005\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0006\u001a\u0002H\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00030\b\u00a2\u0006\u0002\u0010\t\u00a8\u0006\n"}, d2={"main", "", "performTransformation", "R", "T", "", "value", "transformer", "LsyntheticExamplesWoFixes/genericsInOutWhere/Transformer;", "(Ljava/lang/CharSequence;LsyntheticExamplesWoFixes/genericsInOutWhere/Transformer;)Ljava/lang/Object;", "KotlinDecompiler"})
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
