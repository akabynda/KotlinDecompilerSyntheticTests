/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package syntheticExamplesWoFixes.destructuring.CFR.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class DestructuringKt {
    public static void main() {
        Point point = new Point(10, 20);
        int x = point.component1();
        int y = point.component2();
        System.out.println((Object) ("x = " + x + ", y = " + y));
    }

    public static /* synthetic */ void main(String[] args) {
        DestructuringKt.main();
    }
}
