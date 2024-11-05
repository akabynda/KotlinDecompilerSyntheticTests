package syntheticExamples.classDelegation.CFR.ClassDelegationDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 0, 0}, k=1, xi=82, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0001\u00a8\u0006\u0007"}, d2={"LsyntheticExamples/classDelegation/Derived;", "LsyntheticExamples/classDelegation/Base;", "base", "<init>", "(LsyntheticExamples/classDelegation/Base;)V", "printMessage", "", "KotlinDecompiler"})
public final class Derived
        implements Base {
    private final /* synthetic */ Base $$delegate_0;

    public Derived(@NotNull Base base) {
        Intrinsics.checkNotNullParameter((Object)base, (String)"base");
        this.$$delegate_0 = base;
    }

    @Override
    public void printMessage() {
        this.$$delegate_0.printMessage();
    }
}
