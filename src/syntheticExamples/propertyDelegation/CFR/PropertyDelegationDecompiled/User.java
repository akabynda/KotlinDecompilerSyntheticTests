package syntheticExamples.propertyDelegation.CFR.PropertyDelegationDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 0, 0}, k=1, xi=82, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2={"LsyntheticExamples/propertyDelegation/User;", "", "<init>", "()V", "<set-?>", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name$delegate", "Lkotlin/properties/ReadWriteProperty;", "KotlinDecompiler"})
@SourceDebugExtension(value={"SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"})
public final class User {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty name$delegate;

    public User() {
        Delegates delegates = Delegates.INSTANCE;
        String initialValue$iv = "<not set>";
        boolean $i$f$observable = false;
        this.name$delegate = (ReadWriteProperty)new ObservableProperty<String>((String) initialValue$iv){

            /*
             * Ignored method signature, as it can't be verified against descriptor
             * WARNING - void declaration
             */
            /*
            protected void afterChange(KProperty property, Object oldValue, Object newValue) {
                void newValue2;
                void oldValue2;
                Intrinsics.checkNotNullParameter((Object)property, (String)"property");
                String string = (String)newValue;
                String string2 = (String)oldValue;
                KProperty property2 = property;
                boolean bl = false;
                System.out.println((Object)("Name changed from \"" + (String)oldValue2 + "\" to \"" + (String)newValue2 + '\"'));
            }
             */
        };
    }

    @NotNull
    public final String getName() {
        return (String)this.name$delegate.getValue((Object)this, $$delegatedProperties[0]);
    }

    public final void setName(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"<set-?>");
        this.name$delegate.setValue((Object)this, $$delegatedProperties[0], (Object)string);
    }

    static {
        KProperty[] kPropertyArray = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)((MutablePropertyReference1)new MutablePropertyReference1Impl(User.class, "name", "getName()Ljava/lang/String;", 0)))};
        $$delegatedProperties = kPropertyArray;
    }
}