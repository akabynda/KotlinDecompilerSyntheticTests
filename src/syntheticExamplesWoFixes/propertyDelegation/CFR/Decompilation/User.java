/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.MutablePropertyReference1
 *  kotlin.jvm.internal.MutablePropertyReference1Impl
 *  kotlin.jvm.internal.Reflection
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.properties.Delegates
 *  kotlin.properties.ObservableProperty
 *  kotlin.properties.ReadWriteProperty
 *  kotlin.reflect.KProperty
 *  org.jetbrains.annotations.NotNull
 */
/*
package syntheticExamplesWoFixes.propertyDelegation.CFR.Decompilation;

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

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2={"LsyntheticExamplesWoFixes/propertyDelegation/User;", "", "()V", "<set-?>", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name$delegate", "Lkotlin/properties/ReadWriteProperty;", "KotlinDecompiler"})
@SourceDebugExtension(value={"SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"})
public final class User {
    static final /* synthetic */ /* KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty name$delegate;

    public User() {
        Delegates delegates = Delegates.INSTANCE;
        String initialValue$iv = "<not set>";
        boolean $i$f$observable = false;
        this.name$delegate = (ReadWriteProperty)new ObservableProperty<String>((Object)initialValue$iv){

            /*
             * Ignored method signature, as it can't be verified against descriptor
             * WARNING - void declaration
             */
            /* protected void afterChange(@NotNull KProperty property, Object oldValue, Object newValue) {
                void newValue2;
                void oldValue2;
                Intrinsics.checkNotNullParameter((Object)property, (String)"property");
                String string = (String)newValue;
                String string2 = (String)oldValue;
                KProperty property2 = property;
                boolean bl = false;
                System.out.println((Object)("Name changed from \"" + (String)oldValue2 + "\" to \"" + (String)newValue2 + '\"'));
            }
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
*/