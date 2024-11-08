package syntheticExamples.classDelegation.JDGUI.ClassDelegationDecompiled;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\022\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\002\n\000\030\0002\0020\001B\017\022\006\020\002\032\0020\001\006\004\b\003\020\004J\t\020\005\032\0020\006H\001\006\007"}, d2 = {"LsyntheticExamples/classDelegation/Derived;", "LsyntheticExamples/classDelegation/Base;", "base", "<init>", "(LsyntheticExamples/classDelegation/Base;)V", "printMessage", "", "KotlinDecompiler"})
public final class Derived implements Base {
    private final Base $$delegate_0;

    public Derived(@NotNull Base base) {
        this.$$delegate_0 = base;
    }

    public void printMessage() {
        this.$$delegate_0.printMessage();
    }
}