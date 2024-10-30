package syntheticExamples.simpleLambda.Fernflower;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
@SourceDebugExtension({"SMAP\nLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lambda.kt\nlambda/LambdaKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1863#2,2:8\n*S KotlinDebug\n*F\n+ 1 Lambda.kt\nlambda/LambdaKt\n*L\n5#1:8,2\n*E\n"})
public final class LambdaDecompiled {
    public static final void main() {
        Integer[] var1 = new Integer[]{1, 2, 3, 4, 5};
        List numbers = CollectionsKt.listOf(var1);
        Iterable $this$forEach$iv = (Iterable)numbers;
        // Doesn't compile: int $i$f$forEach = false;
        boolean $i$f$forEach = false;
        Iterator var3 = $this$forEach$iv.iterator();

        while(var3.hasNext()) {
            Object element$iv = var3.next();
            int n = ((Number)element$iv).intValue();
            // Doesn't compile: int var6 = false;
            boolean var6 = false;
            int var7 = n * n;
            System.out.println(var7);
        }

    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
