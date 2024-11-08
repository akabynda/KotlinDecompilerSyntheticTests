package syntheticExamples.higherOrderFunction.JDGUI;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

//'kotlin. Function' cannot be inherited as a raw type and with generic type arguments 'java. lang. Integer'

/*
@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class HigherOrderFunctionDecompiled {
    public static final void main() {
        Function1 square = HigherOrderFunctionDecompiled$main$square$1.INSTANCE;
        int result = ((Number)square.invoke(Integer.valueOf(5))).intValue();
        System.out.println(result);
    }

    @Metadata(mv = {2, 0, 0}, k = 3, xi = 82, d1 = {"\000\n\n\000\n\002\020\b\n\002\b\003\020\000\032\0020\0012\006\020\002\032\0020\001H\n\006\004\b\003\020\004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"})
    static final class HigherOrderFunctionDecompiled$main$square$1 extends Lambda implements Function1<Integer, Integer> {
        public static final HigherOrderFunctionDecompiled$main$square$1 INSTANCE = new HigherOrderFunctionDecompiled$main$square$1();

        HigherOrderFunctionDecompiled$main$square$1() {
            super(1);
        }

        @Override
        public Integer invoke(Integer integer) {
            return integer * integer;
        }
    }
}
 */
