package syntheticExamples.builder.Fernflower;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001d\u0010\u0003\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u001a\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"},
        d2 = {"buildList", "", "", "block", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "main", "KotlinDecompiler"}
)
public final class BuilderDecompiled {
    @NotNull
    // public static final List buildList(@NotNull Function1 block) {
    public static final <T> List<T> buildList(@NotNull Function1<? super List<T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        // List list = (List)(new ArrayList());
        List<T> list = new ArrayList<>();
        block.invoke(list);
        return list;
    }

    public static final void main() {
        // List numbers = buildList(BuilderDecompiled::main$lambda$0);
        List<Integer> numbers = buildList(BuilderDecompiled::populateListWithIntegers);
        System.out.println(numbers);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }

    // private static final Unit main$lambda$0(List $this$buildList) {
    private static final Unit populateListWithIntegers(List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        list.add(1);
        list.add(2);
        list.add(3);
        return Unit.INSTANCE;
    }
}
