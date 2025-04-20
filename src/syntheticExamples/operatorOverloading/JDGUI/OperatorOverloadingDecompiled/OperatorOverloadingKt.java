package syntheticExamples.operatorOverloading.JDGUI.OperatorOverloadingDecompiled;

import kotlin.Metadata;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class OperatorOverloadingKt {
    public static void main() {
        Vector v1 = new Vector(1, 2);
        Vector v2 = new Vector(3, 4);
        Vector v3 = v1.plus(v2);
        System.out.println(v3);
    }
}