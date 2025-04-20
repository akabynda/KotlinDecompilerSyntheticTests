package syntheticExamplesWoFixes.generic.JDGUI.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\016\n\002\030\002\n\000\n\002\020\000\n\002\b\006\030\000*\004\b\000\020\0012\0020\002B\r\022\006\020\003\032\0028\000¢\006\002\020\004R\023\020\003\032\0028\000¢\006\n\n\002\020\007\032\004\b\005\020\006¨\006\b"}, d2 = {"LsyntheticExamplesWoFixes/generic/Box;", "T", "", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "KotlinDecompiler"})
public final class Box<T> {
    private final T value;

    public Box(Object value) {
        this.value = (T) value;
    }

    public T getValue() {
        return this.value;
    }
}


/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/generic/Box.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */