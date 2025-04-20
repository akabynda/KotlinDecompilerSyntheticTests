package syntheticExamplesWoFixes.simpleException.JDGUI.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001¨\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class ExceptionKt {
    public static void main() {
        try {
            int i = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero!");
        }
    }
}
