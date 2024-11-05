package syntheticExamples.simpleLambda.CFR;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"main", "", "KotlinDecompiler"})
@SourceDebugExtension(value={"SMAP\nLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lambda.kt\nsyntheticExamples/simpleLambda/LambdaDecompiled\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1863#2,2:8\n*S KotlinDebug\n*F\n+ 1 Lambda.kt\nsyntheticExamples/simpleLambda/LambdaDecompiled\n*L\n5#1:8,2\n*E\n"})
public final class LambdaDecompiled {
    public static final void main() {
        Object[] objectArray = new Integer[]{1, 2, 3, 4, 5};
        List numbers = CollectionsKt.listOf((Object[])objectArray);
        Iterable $this$forEach$iv = numbers;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            int n = ((Number)element$iv).intValue();
            boolean bl = false;
            int n2 = n * n;
            System.out.println(n2);
        }
    }

    public static /* synthetic */ void main(String[] args) {
        LambdaDecompiled.main();
    }
}
