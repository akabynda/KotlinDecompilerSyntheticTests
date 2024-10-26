package list.CFR;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(mv={2, 0, 0}, k=2, xi=82, d1={"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"}, d2={"main", "", "KotlinDecompiler"})
public final class ListDecompiled {
    public static final void main() {
        String[] stringArray = new String[]{"\u042f\u0431\u043b\u043e\u043a\u043e", "\u0411\u0430\u043d\u0430\u043d", "\u0412\u0438\u0448\u043d\u044f"};
        List list = CollectionsKt.listOf((Object[])stringArray);
        // Doesn't compile: for (String fruit : list) {
        for (Object fruit : list) {
            System.out.println((Object)fruit);
        }
    }

    public static /* synthetic */ void main(String[] args) {
        ListDecompiled.main();
    }
}
