/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.SourceDebugExtension
 */
package syntheticExamplesWoFixes.simpleLambda.CFR.Decompilation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"main", "", "KotlinDecompiler"})
@SourceDebugExtension(value={"SMAP\nLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lambda.kt\nsyntheticExamplesWoFixes/simpleLambda/LambdaKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1855#2,2:8\n*S KotlinDebug\n*F\n+ 1 Lambda.kt\nsyntheticExamplesWoFixes/simpleLambda/LambdaKt\n*L\n5#1:8,2\n*E\n"})
public final class LambdaKt {
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
        LambdaKt.main();
    }
}
