package syntheticExamples.destructuring.Fernflower.DestructuringDecompiled;

import kotlin.Metadata;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class DestructuringKt {
    public static void main() {
        Point var0 = new Point(10, 20);
        int x = var0.component1();
        int y = var0.component2();
        String var3 = "x = " + x + ", y = " + y;
        System.out.println(var3);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
