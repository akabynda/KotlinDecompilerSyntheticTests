package syntheticExamples.simpleLambda.JDGUI;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

import java.util.Iterator;
import java.util.List;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
@SourceDebugExtension({"SMAP\nLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lambda.kt\nsyntheticExamples/simpleLambda/LambdaDecompiled\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1863#2,2:8\n*S KotlinDebug\n*F\n+ 1 Lambda.kt\nsyntheticExamples/simpleLambda/LambdaDecompiled\n*L\n5#1:8,2\n*E\n"})
public final class LambdaDecompiled {
    public static void main() {
        Integer[] arrayOfInteger = new Integer[5];
        arrayOfInteger[0] = Integer.valueOf(1);
        arrayOfInteger[1] = Integer.valueOf(2);
        arrayOfInteger[2] = Integer.valueOf(3);
        arrayOfInteger[3] = Integer.valueOf(4);
        arrayOfInteger[4] = Integer.valueOf(5);
        List numbers = CollectionsKt.listOf((Object[]) arrayOfInteger);
        Iterable $this$forEach$iv = numbers;
        int $i$f$forEach = 0;
        Iterator iterator = $this$forEach$iv.iterator();
        if (iterator.hasNext()) {
            Object element$iv = iterator.next();
            // int n = ((Number)element$iv).intValue(), $i$a$-forEach-LambdaDecompiled$main$1 = 0;
            int n = ((Number) element$iv).intValue();
            int i = n * n;
            System.out.println(i);
        }
    }
}
