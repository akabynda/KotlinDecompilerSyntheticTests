package syntheticExamples.tailRecursion.Fernflower;

import kotlin.Metadata;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u001b\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\u0010¨\u0006\u0006"},
        d2 = {"main", "", "sum", "", "n", "acc", "KotlinDecompiler"}
)
public final class TailRecursionDecompiled {
    public static final int sum(int n, int acc) {
        while(n != 0) {
            int var2 = n - 1;
            int var3 = acc + n;
            n = var2;
            acc = var3;
        }

        return acc;
    }

    // $FF: synthetic method
    public static int sum$default(int var0, int var1, int var2, Object var3) {
        if ((var2 & 2) != 0) {
            var1 = 0;
        }

        return sum(var0, var1);
    }

    public static final void main() {
        int var0 = sum$default(10000, 0, 2, (Object)null);
        System.out.println(var0);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
