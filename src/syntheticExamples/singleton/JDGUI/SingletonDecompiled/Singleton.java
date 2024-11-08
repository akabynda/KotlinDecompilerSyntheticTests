package syntheticExamples.singleton.JDGUI.SingletonDecompiled;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\b\002\030\0002\0020\001B\t\b\002\006\004\b\002\020\003J\006\020\004\032\0020\005\006\006"}, d2 = {"LsyntheticExamples/singleton/Singleton;", "", "<init>", "()V", "doSomething", "", "KotlinDecompiler"})
public final class Singleton {
    @NotNull
    public static final Singleton INSTANCE = new Singleton();

    public final void doSomething() {
        System.out.println("Do something");
    }
}