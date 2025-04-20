package syntheticExamples.singleton.Fernflower.SingletonDecompiled;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"},
        d2 = {"LsyntheticExamples/singleton/Singleton;", "", "()V", "doSomething", "", "KotlinDecompiler"}
)
public final class Singleton {
    @NotNull
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public void doSomething() {
        String var1 = "Do something";
        System.out.println(var1);
    }
}
