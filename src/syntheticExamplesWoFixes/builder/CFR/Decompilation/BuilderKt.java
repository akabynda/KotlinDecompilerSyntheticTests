/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
/*
package syntheticExamplesWoFixes.builder.CFR.Decompilation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001d\u0010\u0003\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\b\u0007\u001a\u0006\u0010\b\u001a\u00020\u0006\u00a8\u0006\t"}, d2={"buildList", "", "", "block", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "main", "KotlinDecompiler"})
public final class BuilderKt {
    @NotNull
    public static final List<Integer> buildList(@NotNull Function1<? super List<Integer>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, (String)"block");
        List list = new ArrayList();
        block.invoke((Object)list);
        return list;
    }

    public static final void main() {
        List<Integer> numbers2 = BuilderKt.buildList((Function1<? super List<Integer>, Unit>)((Function1)main.numbers.1.INSTANCE));
        System.out.println(numbers2);
    }

    public static /* synthetic */ /*void main(String[] args) {
        BuilderKt.main();
    }
}
*/