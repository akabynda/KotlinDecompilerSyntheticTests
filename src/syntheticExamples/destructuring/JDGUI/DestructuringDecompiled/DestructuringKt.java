package syntheticExamples.destructuring.JDGUI.DestructuringDecompiled;

import kotlin.Metadata;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class DestructuringKt {
    public static void main() {
        Point point = new Point(10, 20);
        int x = point.component1(), y = point.component2();
        System.out.println("x = " + x + ", y = " + y);
    }
}
