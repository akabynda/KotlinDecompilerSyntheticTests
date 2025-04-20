package syntheticExamples.propertyDelegation.Fernflower.PropertyDelegationDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.*;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"},
        d2 = {"LsyntheticExamples/propertyDelegation/User;", "", "()V", "<set-?>", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name$delegate", "Lkotlin/properties/ReadWriteProperty;", "KotlinDecompiler"}
)
@SourceDebugExtension({"SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"})
public final class User {
    // $FF: synthetic field
    static final KProperty[] $$delegatedProperties;

    static {
        KProperty[] var0 = new KProperty[]{Reflection.mutableProperty1(new MutablePropertyReference1Impl(User.class, "name", "getName()Ljava/lang/String;", 0))};
        $$delegatedProperties = var0;
    }

    @NotNull
    private final ReadWriteProperty name$delegate;

    public User() {
        Delegates var1 = Delegates.INSTANCE;
        Object initialValue$iv = "<not set>";
        // int $i$f$observable = false;
        boolean $i$f$observable = false;
        this.name$delegate = new User$special$$inlined$observable$1(initialValue$iv);
    }

    @NotNull
    public String getName() {
        return (String) this.name$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public void setName(@NotNull String var1) {
        Intrinsics.checkNotNullParameter(var1, "<set-?>");
        this.name$delegate.setValue(this, $$delegatedProperties[0], var1);
    }
}
