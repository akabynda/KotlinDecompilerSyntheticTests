package syntheticExamples.generic.JDGUI.GenericDecompiled;

import kotlin.Metadata;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\000\n\002\b\007\030\000*\004\b\000\020\0012\0020\002B\017\022\006\020\003\032\0028\000\006\004\b\004\020\005R\023\020\003\032\0028\000\006\n\n\002\020\b\032\004\b\006\020\007\006\t"}, d2 = {"LsyntheticExamples/generic/Box;", "T", "", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "KotlinDecompiler"})
public final class Box<T> {
    private final T value;

    public Box(Object value) {
        this.value = (T)value;
    }

    public final T getValue() {
        return this.value;
    }
}