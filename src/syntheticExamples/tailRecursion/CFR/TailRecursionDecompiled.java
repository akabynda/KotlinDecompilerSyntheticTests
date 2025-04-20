package syntheticExamples.tailRecursion.CFR;

import kotlin.Metadata;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\u001b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0086\u0010\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"sum", "", "n", "acc", "main", "", "KotlinDecompiler"})
public final class TailRecursionDecompiled {
    public static int sum(int n, int acc) {
        int n2 = n;
        int n3 = acc;
        while (n2 != 0) {
            int n4 = n2 - 1;
            int n5 = n3 + n2;
            n2 = n4;
            n3 = n5;
        }
        return n3;
    }

    public static /* synthetic */ int sum$default(int n, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return TailRecursionDecompiled.sum(n, n2);
    }

    public static void main() {
        int n = TailRecursionDecompiled.sum$default(10000, 0, 2, null);
        System.out.println(n);
    }

    public static /* synthetic */ void main(String[] args) {
        TailRecursionDecompiled.main();
    }
}
