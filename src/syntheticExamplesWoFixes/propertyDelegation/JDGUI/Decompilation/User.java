/*
package syntheticExamplesWoFixes.propertyDelegation.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.*;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\b\030\0002\0020\001B\005¢\006\002\020\002R+\020\005\032\0020\0042\006\020\003\032\0020\0048F@FX\002¢\006\022\n\004\b\n\020\013\032\004\b\006\020\007\"\004\b\b\020\t¨\006\f"}, d2 = {"LsyntheticExamplesWoFixes/propertyDelegation/User;", "", "()V", "<set-?>", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name$delegate", "Lkotlin/properties/ReadWriteProperty;", "KotlinDecompiler"})
@SourceDebugExtension({"SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"})
public final class User {
    static {
        KProperty[] arrayOfKProperty = new KProperty[1];
        arrayOfKProperty[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(User.class, "name", "getName()Ljava/lang/String;", 0));
        $$delegatedProperties = (KProperty<Object>[]) arrayOfKProperty;
    }

    @NotNull
    private final ReadWriteProperty name$delegate;

    public User() {
        Delegates delegates = Delegates.INSTANCE;
        Object initialValue$iv = "<not set>";
        int $i$f$observable = 0;
        this.name$delegate =

                (ReadWriteProperty) new User$special$$inlined$observable$1(initialValue$iv);
    }

    @NotNull
    public String getName() {
        return (String) this.name$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public void setName(@NotNull String<set-?>) {
        Intrinsics.checkNotNullParameter( < set - ?>,"<set-?>")
        this.name$delegate.setValue(this, $$delegatedProperties[0], < set - ?>)
    }
}

 */
