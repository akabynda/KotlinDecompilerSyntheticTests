package syntheticExamples.singleton.CFR.SingletonDecompiled;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, d2 = {"LsyntheticExamples/singleton/Singleton;", "", "<init>", "()V", "doSomething", "", "KotlinDecompiler"})
public final class Singleton {
    @NotNull
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public void doSomething() {
        System.out.println((Object) "Do something");
    }
}
