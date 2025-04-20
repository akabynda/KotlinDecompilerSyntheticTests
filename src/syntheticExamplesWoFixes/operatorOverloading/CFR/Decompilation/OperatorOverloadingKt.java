/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package syntheticExamplesWoFixes.operatorOverloading.CFR.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class OperatorOverloadingKt {
    public static void main() {
        Vector v1 = new Vector(1, 2);
        Vector v2 = new Vector(3, 4);
        Vector v3 = v1.plus(v2);
        System.out.println(v3);
    }

    public static /* synthetic */ void main(String[] args) {
        OperatorOverloadingKt.main();
    }
}
