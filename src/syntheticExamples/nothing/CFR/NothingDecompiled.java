package syntheticExamples.nothing.CFR;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, d2={"fail", "", "message", "", "main", "", "KotlinDecompiler"})
public final class NothingDecompiled {
    @NotNull
    public static final Void fail(@NotNull String message) {
        Intrinsics.checkNotNullParameter((Object)message, (String)"message");
        throw new IllegalArgumentException(message);
    }

    public static final void main() {
        NothingDecompiled.fail("An error occurred");
        // not working: throw new KotlinNothingValueException();
    }

    public static /* synthetic */ void main(String[] args) {
        NothingDecompiled.main();
    }
}
