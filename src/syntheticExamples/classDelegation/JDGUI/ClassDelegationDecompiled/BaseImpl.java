package syntheticExamples.classDelegation.JDGUI.ClassDelegationDecompiled;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\002\n\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003\006\004\b\004\020\005J\b\020\b\032\0020\tH\026R\021\020\002\032\0020\003\006\b\n\000\032\004\b\006\020\007\006\n"}, d2 = {"LsyntheticExamples/classDelegation/BaseImpl;", "LsyntheticExamples/classDelegation/Base;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "printMessage", "", "KotlinDecompiler"})
public final class BaseImpl implements Base {
    @NotNull
    private final String message;

    public BaseImpl(@NotNull String message) {
        this.message = message;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public void printMessage() {
        System.out.println(this.message);
    }
}