/*
package syntheticExamplesWoFixes.sequenceProcessing.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001¨\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class SequenceProcessingKt {
    public static void main() {
        Integer[] arrayOfInteger = new Integer[5];
        arrayOfInteger[0] = Integer.valueOf(1);
        arrayOfInteger[1] = Integer.valueOf(2);
        arrayOfInteger[2] = Integer.valueOf(3);
        arrayOfInteger[3] = Integer.valueOf(4);
        arrayOfInteger[4] = Integer.valueOf(5);
        List numbers =

                SequencesKt.toList(SequencesKt.map(SequencesKt.filter(SequencesKt.sequenceOf((Object[]) arrayOfInteger), SequenceProcessingKt$main$numbers$1.INSTANCE), SequenceProcessingKt$main$numbers$2.INSTANCE));
        System.out.println(numbers);
    }

    @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"})
    static final class SequenceProcessingKt$main$numbers$1 extends Lambda implements Function1<Integer, Boolean> {
        public static final SequenceProcessingKt$main$numbers$1 INSTANCE = new SequenceProcessingKt$main$numbers$1();

        SequenceProcessingKt$main$numbers$1() {
            super(1);
        }

        @NotNull
        public Boolean invoke(int it) {
            return Boolean.valueOf((it % 2 == 0));
        }
    }

    @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n¢\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
    static final class SequenceProcessingKt$main$numbers$2 extends Lambda implements Function1<Integer, Integer> {
        public static final SequenceProcessingKt$main$numbers$2 INSTANCE = new SequenceProcessingKt$main$numbers$2();

        SequenceProcessingKt$main$numbers$2() {
            super(1);
        }

        @NotNull
        public Integer invoke(int it) {
            return Integer.valueOf(it * it);
        }
    }
}

 */