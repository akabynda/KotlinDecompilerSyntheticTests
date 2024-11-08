package syntheticExamples.propertyDelegation.JDGUI.PropertyDelegationDecompiled;

// doesn't work

/*
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\b\030\0002\0020\001B\007\006\004\b\002\020\003R+\020\006\032\0020\0052\006\020\004\032\0020\0058F@FX\002\006\022\n\004\b\013\020\f\032\004\b\007\020\b\"\004\b\t\020\n\006\r"}, d2 = {"LsyntheticExamples/propertyDelegation/User;", "", "<init>", "()V", "<set-?>", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name$delegate", "Lkotlin/properties/ReadWriteProperty;", "KotlinDecompiler"})
@SourceDebugExtension({"SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"})
public final class User {
    @NotNull
    private final ReadWriteProperty name$delegate;

    public User() {
        Delegates delegates = Delegates.INSTANCE;
        Object initialValue$iv = "<not set>";
        int $i$f$observable = 0;
        this.name$delegate =

                (ReadWriteProperty)new User$special$$inlined$observable$1(initialValue$iv);
    }

    @NotNull
    public final String getName() {
        return (String)this.name$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void setName(@NotNull String <set-?>) {
        Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
        this.name$delegate.setValue(this, $$delegatedProperties[0], <set-?>);
    }

    static {
        KProperty[] arrayOfKProperty = new KProperty[1];
        arrayOfKProperty[0] = (KProperty)Reflection.mutableProperty1((MutablePropertyReference1)new MutablePropertyReference1Impl(User.class, "name", "getName()Ljava/lang/String;", 0));
        $$delegatedProperties = (KProperty<Object>[])arrayOfKProperty;
    }
}

 */
