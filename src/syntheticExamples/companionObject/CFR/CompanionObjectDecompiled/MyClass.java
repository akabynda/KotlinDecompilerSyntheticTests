package syntheticExamples.companionObject.CFR.CompanionObjectDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 0, 0}, k=1, xi=82, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, d2={"LsyntheticExamples/companionObject/MyClass;", "", "<init>", "()V", "Companion", "KotlinDecompiler"})
public final class MyClass {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(mv={2, 0, 0}, k=1, xi=82, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, d2={"LsyntheticExamples/companionObject/MyClass$Companion;", "", "<init>", "()V", "greet", "", "KotlinDecompiler"})
    public static final class Companion {
        private Companion() {
        }

        public final void greet() {
            System.out.println((Object)"Hello from companion object!");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
