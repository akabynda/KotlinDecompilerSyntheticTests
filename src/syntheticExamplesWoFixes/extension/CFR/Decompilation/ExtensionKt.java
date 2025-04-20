/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package syntheticExamplesWoFixes.extension.CFR.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0003\u00a8\u0006\u0004"}, d2 = {"main", "", "greet", "", "KotlinDecompiler"})
public final class ExtensionKt {
    @NotNull
    public static String greet(@NotNull String $this$greet) {
        Intrinsics.checkNotNullParameter($this$greet, "<this>");
        return "Hello, " + $this$greet;
    }

    public static void main() {
        System.out.println((Object) ExtensionKt.greet("World"));
    }

    public static /* synthetic */ void main(String[] args) {
        ExtensionKt.main();
    }
}
