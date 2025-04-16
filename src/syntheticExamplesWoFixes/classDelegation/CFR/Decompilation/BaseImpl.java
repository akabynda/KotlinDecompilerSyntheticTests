/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package syntheticExamplesWoFixes.classDelegation.CFR.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2={"LsyntheticExamplesWoFixes/classDelegation/BaseImpl;", "LsyntheticExamplesWoFixes/classDelegation/Base;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "printMessage", "", "KotlinDecompiler"})
public final class BaseImpl
implements Base {
    @NotNull
    private final String message;

    public BaseImpl(@NotNull String message) {
        Intrinsics.checkNotNullParameter((Object)message, (String)"message");
        this.message = message;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @Override
    public void printMessage() {
        System.out.println((Object)this.message);
    }
}
