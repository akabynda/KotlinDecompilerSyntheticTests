package syntheticExamples.labeledBlocks.Fernflower;

import kotlin.Metadata;

@Metadata(
        mv = {1, 9, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class LabeledBlocksDecompiled {
    public static final void main() {
        for(int i = 1; i < 6; ++i) {
            for(int j = 1; j < 6; ++j) {
                String var2;
                if (i * j > 6) {
                    var2 = "Breaking out of the outer loop at i = " + i + ", j = " + j;
                    System.out.println(var2);
                    return;
                }

                var2 = "i = " + i + ", j = " + j;
                System.out.println(var2);
            }
        }

    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
