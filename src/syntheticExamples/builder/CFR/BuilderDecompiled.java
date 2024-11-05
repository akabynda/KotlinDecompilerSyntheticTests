package syntheticExamples.builder.CFR;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001d\u0010\u0003\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007\u001a\u0006\u0010\b\u001a\u00020\u0006\u00a8\u0006\t"}, d2={"buildList", "", "", "block", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "main", "KotlinDecompiler"})
public final class BuilderDecompiled {
    @NotNull
    public static final List<Integer> buildList(@NotNull Function1<? super List<Integer>, Unit> block) {
        //Intrinsics.checkNotNullParameter(block, (String)"block");
        if (block == null) {
            throw new IllegalArgumentException("block cannot be null");
        }
        // List list = new ArrayList();
        List<Integer> list = new ArrayList<>();
        // block.invoke((Object)list);
        block.invoke(list);
        return list;
    }

    public static final void main() {
        // List<Integer> numbers2 = BuilderDecompiled.buildList((Function1<? super List<Integer>, Unit>)((Function1)main.numbers.1.INSTANCE));
        List<Integer> numbers = buildList(list -> {
            list.add(1);
            list.add(2);
            list.add(3);
            return null;
        });
        System.out.println(numbers);
    }

    public static /* synthetic */ void main(String[] args) {
        BuilderDecompiled.main();
    }
}
