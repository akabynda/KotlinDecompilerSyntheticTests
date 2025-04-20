package syntheticExamplesWoFixes.recursion.JDGUI.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\001\032\006\020\003\032\0020\004¨\006\005"}, d2 = {"factorial", "", "n", "main", "", "KotlinDecompiler"})
public final class RecursionKt {
    public static int factorial(int n) {
        return (n <= 1) ? 1 : (n * factorial(n - 1));
    }

    public static void main() {
        int i = factorial(5);
        System.out.println(i);
    }
}


/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/recursion/RecursionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */