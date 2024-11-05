package syntheticExamples.extension.CFR;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"}, d2={"greet", "", "main", "", "KotlinDecompiler"})
public final class ExtensionDecompiled {
    @NotNull
    public static final String greet(@NotNull String $this$greet) {
        Intrinsics.checkNotNullParameter((Object)$this$greet, (String)"<this>");
        return "Hello, " + $this$greet;
    }

    public static final void main() {
        System.out.println((Object)ExtensionDecompiled.greet("World"));
    }

    public static /* synthetic */ void main(String[] args) {
        ExtensionDecompiled.main();
    }
}