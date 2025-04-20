/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package syntheticExamplesWoFixes.abruptControlFlow.CFR.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class AbruptControlFlowKt {
    public static void main() {
        for (int i = 1; i < 11; ++i) {
            if (i == 5) {
                System.out.println((Object) ("Breaking the loop at " + i));
                break;
            }
            if (i % 2 == 0) {
                System.out.println((Object) ("Skipping even number: " + i));
                continue;
            }
            System.out.println((Object) ("Current value: " + i));
        }
    }

    public static /* synthetic */ void main(String[] args) {
        AbruptControlFlowKt.main();
    }
}
