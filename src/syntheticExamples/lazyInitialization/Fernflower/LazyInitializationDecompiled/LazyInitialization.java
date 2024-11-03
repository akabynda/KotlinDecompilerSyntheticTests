package syntheticExamples.lazyInitialization.Fernflower.LazyInitializationDecompiled;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"},
        d2 = {"LsyntheticExamples/lazyInitialization/LazyInitialization;", "", "()V", "value", "", "getValue", "()Ljava/lang/String;", "value$delegate", "Lkotlin/Lazy;", "KotlinDecompiler"}
)
public final class LazyInitialization {
    @NotNull
    private final Lazy value$delegate = LazyKt.lazy(LazyInitialization::value_delegate);

    @NotNull
    public final String getValue() {
        Lazy var1 = this.value$delegate;
        Object var2 = null;
        return (String)var1.getValue();
    }

    private static final String value_delegate() {
        String var0 = "Initializing";
        System.out.println(var0);
        return "Initialized";
    }
}