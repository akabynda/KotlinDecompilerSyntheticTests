package syntheticExamples.generic.CFR.GenericDecompiled;

import kotlin.Metadata;

@Metadata(mv={2, 0, 0}, k=1, xi=82, d1={"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2={"LsyntheticExamples/generic/Box;", "T", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "KotlinDecompiler"})
public final class Box<T> {
    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public final T getValue() {
        return this.value;
    }
}