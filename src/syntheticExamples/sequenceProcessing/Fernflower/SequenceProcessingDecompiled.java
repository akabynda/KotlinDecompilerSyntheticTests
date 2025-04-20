package syntheticExamples.sequenceProcessing.Fernflower;

import kotlin.Metadata;
import kotlin.sequences.SequencesKt;

import java.util.List;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class SequenceProcessingDecompiled {
    public static void main() {
        Integer[] var1 = new Integer[]{1, 2, 3, 4, 5};
        List numbers = SequencesKt.toList(SequencesKt.map(SequencesKt.filter(SequencesKt.sequenceOf(var1), SequenceProcessingDecompiled::main$lambda$0), SequenceProcessingDecompiled::main$lambda$1));
        System.out.println(numbers);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }

    private static boolean main$lambda$0(int it) {
        return it % 2 == 0;
    }

    private static int main$lambda$1(int it) {
        return it * it;
    }
}
