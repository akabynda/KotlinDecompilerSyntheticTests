/*
package syntheticExamplesWoFixes.lazyInitialization.JDGUI.Decompilation;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\005\030\0002\0020\001B\005¢\006\002\020\002R\033\020\003\032\0020\0048FX\002¢\006\f\n\004\b\007\020\b\032\004\b\005\020\006¨\006\t"}, d2 = {"LsyntheticExamplesWoFixes/lazyInitialization/LazyInitialization;", "", "()V", "value", "", "getValue", "()Ljava/lang/String;", "value$delegate", "Lkotlin/Lazy;", "KotlinDecompiler"})
public final class LazyInitialization {
    @NotNull
    private final Lazy value$delegate = LazyKt.lazy(LazyInitialization$value$2.INSTANCE);

    @NotNull
    public String getValue() {
        Lazy lazy = this.value$delegate;
        return (String) lazy.getValue();
    }

    @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
    static final class LazyInitialization$value$2 extends Lambda implements Function0<String> {
        public static final LazyInitialization$value$2 INSTANCE = new LazyInitialization$value$2();

        LazyInitialization$value$2() {
            super(0);
        }

        @NotNull
        public String invoke() {
            System.out.println("Initializing");
            return "Initialized";
        }
    }
}

 */

/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/lazyInitialization/LazyInitialization.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */