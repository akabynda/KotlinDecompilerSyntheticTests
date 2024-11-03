package syntheticExamples.higherOrderFunction.Fernflower;

import kotlin.Metadata;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class HigherOrderFunctionDecompiled {
    public static final void main() {
        // Function1 square = HigherOrderFunctionDecompiled::main$lambda$0;
        // int result = ((Number)square.invoke(5)).intValue();

        int result = square(5);
        System.out.println(result);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }

    // private static final int main$lambda$0(int it) {
    private static final int square(int it) {
        return it * it;
    }
}