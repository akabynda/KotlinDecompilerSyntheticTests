package syntheticExamples.labeledBlocks.CFR;

import kotlin.Metadata;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"main", "", "KotlinDecompiler"})
public final class LabeledBlocksDecompiled {
    public static final void main() {
        block0: for (int i = 1; i < 6; ++i) {
            for (int j = 1; j < 6; ++j) {
                if (i * j > 6) {
                    System.out.println((Object)("Breaking out of the outer loop at i = " + i + ", j = " + j));
                    break block0;
                }
                System.out.println((Object)("i = " + i + ", j = " + j));
            }
        }
    }

    public static /* synthetic */ void main(String[] args) {
        LabeledBlocksDecompiled.main();
    }
}