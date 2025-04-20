package syntheticExamples.result.CFR;

// doesn't work

/*
@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2={"getResult", "Lkotlin/Result;", "", "value", "(I)Ljava/lang/Object;", "main", "", "KotlinDecompiler"})
public final class ResultDecompiled {
    @NotNull
    public static final Object getResult(int value) {
        return value > 0 ? Result.constructor-impl((Object)value) : Result.constructor-impl((Object)kotlin.ResultDecompiled.createFailure((Throwable)new Exception("Value must be positive")));
    }

    public static final void main() {
        block1: {
            Throwable throwable;
            Object result = ResultDecompiled.getResult(-1);
            Object object = result;
            if (Result.isSuccess-impl((Object)object)) {
                int it = ((Number)object).intValue();
                boolean bl = false;
                System.out.println((Object)("Success: " + it));
            }
            Throwable throwable2 = Result.exceptionOrNull-impl((Object)object);
            if (throwable2 == null) break block1;
            Throwable it = throwable = throwable2;
            boolean bl = false;
            System.out.println((Object)("Error: " + it.getMessage()));
        }
    }
}
 */
