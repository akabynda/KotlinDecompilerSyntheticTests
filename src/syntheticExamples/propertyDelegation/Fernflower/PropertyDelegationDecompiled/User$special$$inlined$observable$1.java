package syntheticExamples.propertyDelegation.Fernflower.PropertyDelegationDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"},
        d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}
)
@SourceDebugExtension({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n*L\n1#1,34:1\n7#2,2:35\n*E\n"})
public final class User$special$$inlined$observable$1 extends ObservableProperty {
    public User$special$$inlined$observable$1(Object $initialValue) {
        super($initialValue);
    }

    protected void afterChange(KProperty property, Object oldValue, Object newValue) {
        Intrinsics.checkNotNullParameter(property, "property");
        // String newValue = (String)newValue;
        String NewValue = (String)newValue;
        // String oldValue = (String)oldValue;
        String OldValue = (String)oldValue;
        // int var7 = false;
        boolean var7 = false;
        String var8 = "Name changed from \"" + OldValue + "\" to \"" + NewValue + '"';
        System.out.println(var8);
    }
}
