package syntheticExamples.extension.JDGUI;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\016\n\000\n\002\020\016\n\000\n\002\020\002\n\000\032\n\020\000\032\0020\001*\0020\001\032\006\020\002\032\0020\003\006\004"}, d2 = {"greet", "", "main", "", "KotlinDecompiler"})
public final class ExtensionDecompiled {
    @NotNull
    public static final String greet(@NotNull String $this$greet) {
        Intrinsics.checkNotNullParameter($this$greet, "<this>");
        return "Hello, " + $this$greet;
    }

    public static final void main() {
        System.out.println(greet("World"));
    }
}
