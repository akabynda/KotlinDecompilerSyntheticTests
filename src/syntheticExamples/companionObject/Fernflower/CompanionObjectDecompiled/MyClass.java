package syntheticExamples.companionObject.Fernflower.CompanionObjectDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"},
        d2 = {"LsyntheticExamples/companionObject/MyClass;", "", "()V", "Companion", "KotlinDecompiler"}
)
public final class MyClass {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker)null);

    @Metadata(
            mv = {2, 0, 0},
            k = 1,
            xi = 48,
            d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"},
            d2 = {"LsyntheticExamples/companionObject/MyClass$Companion;", "", "()V", "greet", "", "KotlinDecompiler"}
    )
    public static final class Companion {
        private Companion() {
        }

        public final void greet() {
            String var1 = "Hello from companion object!";
            System.out.println(var1);
        }

        // $FF: synthetic method
        public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
