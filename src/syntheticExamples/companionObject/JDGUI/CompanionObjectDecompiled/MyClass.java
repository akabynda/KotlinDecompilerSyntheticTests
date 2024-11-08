package syntheticExamples.companionObject.JDGUI.CompanionObjectDecompiled;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\004\030\000 \0042\0020\001:\001\004B\007\006\004\b\002\020\003\006\005"}, d2 = {"LsyntheticExamples/companionObject/MyClass;", "", "<init>", "()V", "Companion", "KotlinDecompiler"})
public final class MyClass {
    @NotNull
    public static final Companion Companion = new Companion();

    @Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\b\003\030\0002\0020\001B\t\b\002\006\004\b\002\020\003J\006\020\004\032\0020\005\006\006"}, d2 = {"LsyntheticExamples/companionObject/MyClass$Companion;", "", "<init>", "()V", "greet", "", "KotlinDecompiler"})
    public static final class Companion {
        private Companion() {}

        public final void greet() {
            System.out.println("Hello from companion object!");
        }
    }
}
