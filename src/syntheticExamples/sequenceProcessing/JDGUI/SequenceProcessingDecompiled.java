package syntheticExamples.sequenceProcessing.JDGUI;

// 'kotlin. Function' cannot be inherited as a raw type and with generic type arguments 'java. lang. Boolean'

/*

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class SequenceProcessingDecompiled {
    public static final void main() {
        Integer[] arrayOfInteger = new Integer[5];
        arrayOfInteger[0] = Integer.valueOf(1);
        arrayOfInteger[1] = Integer.valueOf(2);
        arrayOfInteger[2] = Integer.valueOf(3);
        arrayOfInteger[3] = Integer.valueOf(4);
        arrayOfInteger[4] = Integer.valueOf(5);
        List numbers =

                SequencesKt.toList(SequencesKt.map(SequencesKt.filter(SequenceProcessingDecompiled.sequenceOf((Object[])arrayOfInteger), SequenceProcessingDecompiled$main$numbers$1.INSTANCE), SequenceProcessingDecompiled$main$numbers$2.INSTANCE));
        System.out.println(numbers);
    }

    @Metadata(mv = {2, 0, 0}, k = 3, xi = 82, d1 = {"\000\020\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;"})
    static final class SequenceProcessingDecompiled$main$numbers$1 extends Lambda implements Function1<Integer, Boolean> {
        public static final SequenceProcessingDecompiled$main$numbers$1 INSTANCE = new SequenceProcessingDecompiled$main$numbers$1();

        SequenceProcessingDecompiled$main$numbers$1() {
            super(1);
        }

        @Override
        public Boolean invoke(Integer integer) {
            return integer % 2 == 0;
        }
    }

    @Metadata(mv = {2, 0, 0}, k = 3, xi = 82, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
    static final class SequenceProcessingDecompiled$main$numbers$2 extends Lambda implements Function1<Integer, Integer> {
        public static final SequenceProcessingDecompiled$main$numbers$2 INSTANCE = new SequenceProcessingDecompiled$main$numbers$2();

        SequenceProcessingDecompiled$main$numbers$2() {
            super(1);
        }

        @NotNull
        public final Integer invoke(int it) {
            return Integer.valueOf(it * it);
        }
    }
}

 */