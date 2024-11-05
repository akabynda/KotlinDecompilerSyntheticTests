package syntheticExamples.result.Fernflower

// doesn't work

/*
@Metadata(
    mv = {2, 0, 0},
    k = 2,
    xi = 48,
    d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004\u001a\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"},
    d2 = {"getResult", "Lkotlin/Result;", "", "value", "(I)Ljava/lang/Object;", "main", "", "KotlinDecompiler"}
)
public final class ResultJ2K {
    @NotNull
    public static final Object getResult(int value) {
        Object var10000;
        Result.Companion var1;
        if (value > 0) {
            var1 = Result.Companion;
            Integer var2 = value;
            var10000 = Result.constructor-impl(var2);
        } else {
            var1 = Result.Companion;
            Throwable var3 = (Throwable)(new Exception("Value must be positive"));
            var10000 = Result.constructor-impl(kotlin.ResultKt.createFailure(var3));
        }

        return var10000;
    }

    public static final void main() {
        Object result = getResult(-1);
        if (Result.isSuccess-impl(result)) {
            int it = ((Number)result).intValue();
            int var3 = false;
            String var4 = "Success: " + it;
            System.out.println(var4);
        }

        Throwable var10000 = Result.exceptionOrNull-impl(result);
        if (var10000 != null) {
            Throwable var7 = var10000;
            Throwable it = var7;
            int var5 = false;
            String var6 = "Error: " + it.getMessage();
            System.out.println(var6);
        }

    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}

 */