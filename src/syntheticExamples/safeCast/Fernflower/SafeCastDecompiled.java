package syntheticExamples.safeCast.Fernflower;

import kotlin.Metadata;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class SafeCastDecompiled {
    public static void main() {
        Object obj = "String";
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        System.out.println(num);
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
