package syntheticExamples.list.Fernflower;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(
        mv = {2, 0, 0},
        k = 2,
        xi = 48,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
        d2 = {"main", "", "KotlinDecompiler"}
)
public final class ListDecompiled {
    public static final void main() {
        String[] var1 = new String[]{"Яблоко", "Банан", "Вишня"};
        List list = CollectionsKt.listOf(var1);
        Iterator var3 = list.iterator();

        while(var3.hasNext()) {
            String fruit = (String)var3.next();
            System.out.println(fruit);
        }

    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
