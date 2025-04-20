/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package syntheticExamplesWoFixes.simpleException.CFR.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class ExceptionKt {
    public static void main() {
        try {
            int n = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println((Object) "Division by zero!");
        }
    }

    public static /* synthetic */ void main(String[] args) {
        ExceptionKt.main();
    }
}
