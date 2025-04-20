package syntheticExamples.propertyDelegation.Fernflower.PropertyDelegationJ2K

import kotlin.jvm.internal.MutablePropertyReference1
import kotlin.jvm.internal.MutablePropertyReference1Impl
import kotlin.jvm.internal.Reflection
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000c"],
    d2 = ["LsyntheticExamples/propertyDelegation/User;", "", "()V", "<set-?>", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name\$delegate", "Lkotlin/properties/ReadWriteProperty;", "KotlinDecompiler"]
)
 */
@SourceDebugExtension(["SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamples/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"])
class User {
    lateinit var name: String
    private val `name$delegate`: ReadWriteProperty<*, *>

    /*
    var name: String
        get() = `name$delegate`.getValue(
            this,
            `$$delegatedProperties`[0]
        ) as String
        set(var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>")
            `name$delegate`.setValue(
                this,
                `$$delegatedProperties`[0], var1
            )
        }
     */

    init {
        val var1 = Delegates
        val `initialValue$iv`: Any = "<not set>"
        val `$i$f$observable` = false
        this.`name$delegate` = (`User$special$$inlined$observable$1`(`initialValue$iv`))
    }

    companion object {
        // $FF: synthetic field
        val `$$delegatedProperties`: Array<KProperty<*>>

        init {
            val var0 = arrayOf<KProperty<*>>(
                Reflection.mutableProperty1(
                    (MutablePropertyReference1Impl(
                        User::class.java, "name", "getName()Ljava/lang/String;", 0
                    )) as MutablePropertyReference1
                )
            )
            `$$delegatedProperties` = var0
        }
    }
}
