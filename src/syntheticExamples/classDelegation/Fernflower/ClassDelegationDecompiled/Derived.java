package syntheticExamples.classDelegation.Fernflower.ClassDelegationDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import syntheticExamples.classDelegation.Base;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001¨\u0006\u0006"},
        d2 = {"LsyntheticExamples/classDelegation/Derived;", "LsyntheticExamples/classDelegation/Base;", "base", "(LsyntheticExamples/classDelegation/Base;)V", "printMessage", "", "KotlinDecompiler"}
)
public final class Derived implements syntheticExamples.classDelegation.Base {
    // $FF: synthetic field
    private final syntheticExamples.classDelegation.Base $$delegate_0;

    public Derived(@NotNull Base base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super();
        this.$$delegate_0 = base;
    }

    public void printMessage() {
        this.$$delegate_0.printMessage();
    }
}
