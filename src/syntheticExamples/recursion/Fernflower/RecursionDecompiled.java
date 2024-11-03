package syntheticExamples.recursion.Fernflower;

import kotlin.Metadata;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"},
        d2 = {"factorial", "", "n", "main", "", "KotlinDecompiler"}
)
public final class RecursionDecompiled {
    public static final int factorial(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }

    public static final void main() {
        int var0 = factorial(5);
        System.out.println(var0);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
