package syntheticExamples.safeCast.JDGUI;

import kotlin.Metadata;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class SafeCastDecompiled {
    public static final void main() {
        Object obj = "String";
        Integer num = (obj instanceof Integer) ? (Integer)obj : null;
        System.out.println(num);
    }
}
