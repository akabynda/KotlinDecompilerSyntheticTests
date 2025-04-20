package syntheticExamples.abruptControlFlow.Fernflower;

import kotlin.Metadata;

@Metadata(
        mv = {1, 9, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class AbruptControlFlowDecompiled {
    public static void main() {
        for (int i = 1; i < 11; ++i) {
            String var1;
            if (i == 5) {
                var1 = "Breaking the loop at " + i;
                System.out.println(var1);
                break;
            }

            if (i % 2 == 0) {
                var1 = "Skipping even number: " + i;
                System.out.println(var1);
            } else {
                var1 = "Current value: " + i;
                System.out.println(var1);
            }
        }

    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
