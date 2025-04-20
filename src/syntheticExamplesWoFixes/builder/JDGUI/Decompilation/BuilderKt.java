/*
package syntheticExamplesWoFixes.builder.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000 \n\000\n\002\020 \n\002\020\b\n\000\n\002\030\002\n\002\020!\n\002\020\002\n\002\030\002\n\002\b\002\032+\020\000\032\b\022\004\022\0020\0020\0012\035\020\003\032\031\022\n\022\b\022\004\022\0020\0020\005\022\004\022\0020\0060\004¢\006\002\b\007\032\006\020\b\032\0020\006¨\006\t"}, d2 = {"buildList", "", "", "block", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "main", "KotlinDecompiler"})
public final class BuilderKt {
    @NotNull
    public static List<Integer> buildList(@NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        List<Integer> list = new ArrayList();
        block.invoke(list);
        return list;
    }

    public static void main() {
        List<Integer> numbers = buildList(BuilderKt$main$numbers$1.INSTANCE);
        System.out.println(numbers);
    }

    @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\002\020!\n\002\020\b\n\000\020\000\032\0020\001*\b\022\004\022\0020\0030\002H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "", "invoke"})
    static final class BuilderKt$main$numbers$1 extends Lambda implements Function1<List<Integer>, Unit> {
        public static final BuilderKt$main$numbers$1 INSTANCE = new BuilderKt$main$numbers$1();

        BuilderKt$main$numbers$1() {
            super(1);
        }

        public void invoke(@NotNull List<Integer> $this$buildList) {
            Intrinsics.checkNotNullParameter($this$buildList, "$this$buildList");
            $this$buildList.add(Integer.valueOf(1));
            $this$buildList.add(Integer.valueOf(2));
            $this$buildList.add(Integer.valueOf(3));
        }
    }
}
 */