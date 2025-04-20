/*
package syntheticExamplesWoFixes.result.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\002\020\b\n\002\b\003\n\002\020\002\n\000\032\031\020\000\032\b\022\004\022\0020\0020\0012\006\020\003\032\0020\002¢\006\002\020\004\032\006\020\005\032\0020\006¨\006\007"}, d2 = {"getResult", "Lkotlin/Result;", "", "value", "(I)Ljava/lang/Object;", "main", "", "KotlinDecompiler"})
public final class ResultKt {
    @NotNull
    public static Object getResult(int value) {
        return (value > 0) ?
                Result.constructor - impl(Integer.valueOf(value)) :

                Result.constructor - impl(kotlin.ResultKt.createFailure(new Exception("Value must be positive")));
    }

    public static void main() {
        Object result = getResult(-1);
        Object object1 = result;
        if (Result.isSuccess - impl(object1)) {
            int i = ((Number) object1).intValue(), $i$a$ -onSuccess - ResultKt$main$1 = 0;
            System.out.println("Success: " + i);
        }
        object1 = object1;
        Throwable throwable1 = Result.exceptionOrNull - impl(object1), it = throwable1;
        int $i$a$ -onFailure - ResultKt$main$2 = 0;
        System.out.println("Error: " + it.getMessage());
        Result.exceptionOrNull - impl(object1);
    }
}
 */