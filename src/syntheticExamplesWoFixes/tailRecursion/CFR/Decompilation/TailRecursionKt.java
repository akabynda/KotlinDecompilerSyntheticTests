/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package syntheticExamplesWoFixes.tailRecursion.CFR.Decompilation;

import kotlin.Metadata;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u001b\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\u0010\u00a8\u0006\u0006"}, d2={"main", "", "sum", "", "n", "acc", "KotlinDecompiler"})
public final class TailRecursionKt {
    public static final int sum(int n, int acc) {
        while (n != 0) {
            int n2 = n - 1;
            int n3 = acc + n;
            n = n2;
            acc = n3;
        }
        return acc;
    }

    public static /* synthetic */ int sum$default(int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return TailRecursionKt.sum(n, n2);
    }

    public static final void main() {
        int n = TailRecursionKt.sum$default(10000, 0, 2, null);
        System.out.println(n);
    }

    public static /* synthetic */ void main(String[] args) {
        TailRecursionKt.main();
    }
}
