package syntheticExamples.nothing.JDGUI;

// import kotlin.KotlinNothingValueException;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\024\n\000\n\002\020\001\n\000\n\002\020\016\n\000\n\002\020\002\n\000\032\016\020\000\032\0020\0012\006\020\002\032\0020\003\032\006\020\004\032\0020\005\006\006"}, d2 = {"fail", "", "message", "", "main", "", "KotlinDecompiler"})
public final class NothingDecompiled {
    @NotNull
    public static Void fail(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static void main() {
        fail("An error occurred");
        // throw new KotlinNothingValueException();
    }
}
