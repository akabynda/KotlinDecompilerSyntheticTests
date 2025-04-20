package syntheticExamplesWoFixes.extension.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\020\016\n\000\032\006\020\000\032\0020\001\032\n\020\002\032\0020\003*\0020\003¨\006\004"}, d2 = {"main", "", "greet", "", "KotlinDecompiler"})
public final class ExtensionKt {
    @NotNull
    public static String greet(@NotNull String $this$greet) {
        Intrinsics.checkNotNullParameter($this$greet, "<this>");
        return "Hello, " + $this$greet;
    }

    public static void main() {
        System.out.println(greet("World"));
    }
}


/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/extension/ExtensionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */