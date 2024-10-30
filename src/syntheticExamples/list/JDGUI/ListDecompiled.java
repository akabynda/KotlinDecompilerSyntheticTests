package syntheticExamples.list.JDGUI;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(mv = {2, 0, 0}, k = 2, xi = 82, d1 = {"\000\b\n\000\n\002\020\002\n\000\032\006\020\000\032\0020\001\006\002"}, d2 = {"main", "", "KotlinDecompiler"})
public final class ListDecompiled {
    public static final void main() {
        String[] arrayOfString = new String[3];
        arrayOfString[0] = "Яблоко";
        arrayOfString[1] = "Банан";
        arrayOfString[2] = "Вишня";
        List list = CollectionsKt.listOf((Object[])arrayOfString);
        // Doesn't compile: for (String fruit : syntheticExamples.list)
        for (Object fruit : list)
            System.out.println(fruit);
    }
}