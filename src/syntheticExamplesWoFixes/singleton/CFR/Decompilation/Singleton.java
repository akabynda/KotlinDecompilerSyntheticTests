/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package syntheticExamplesWoFixes.singleton.CFR.Decompilation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"LsyntheticExamplesWoFixes/singleton/Singleton;", "", "()V", "doSomething", "", "KotlinDecompiler"})
public final class Singleton {
    @NotNull
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public void doSomething() {
        System.out.println((Object) "Do something");
    }
}
