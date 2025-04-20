/*
// User.java
package syntheticExamplesWoFixes.propertyDelegation.Fernflower

import kotlin.jvm.internal.*
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

@SourceDebugExtension(["SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"])
class User {
    private val `name$delegate`: ReadWriteProperty<*, *>

    var name: String
        get() = `name$delegate`.getValue(this, User.Companion.`$$delegatedProperties`.get(0)) as String
        set(var1) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>")
            `name$delegate`.setValue(this, User.Companion.`$$delegatedProperties`.get(0), var1)
        }

    init {
        val var1 = Delegates
        val `initialValue$iv`: Any = "<not set>"
        val `$i$f$observable`: Int = false.toInt()
        this.`name$delegate` = (`User$special$$inlined$observable$1`(`initialValue$iv`)) as ReadWriteProperty<*, *>
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
            User.Companion.`$$delegatedProperties` = var0
        }
    }
} // User$special$$inlined$observable$1.java

@SourceDebugExtension(["SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates\$observable$1\n+ 2 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n*L\n1#1,73:1\n7#2,2:74\n*E\n"])
class `User$special$$inlined$observable$1`(`$initialValue`: Any?) : ObservableProperty(`$initialValue`) {
    protected fun afterChange(property: KProperty<*>, oldValue: Any, newValue: Any) {
        Intrinsics.checkNotNullParameter(property, "property")
        val newValue = newValue as String
        val oldValue = oldValue as String
        val var7: Int = false.toInt()
        val var8 = "Name changed from \"$oldValue\" to \"$newValue\""
        println(var8)
    }
} // PropertyDelegationKt.java

object PropertyDelegationKt {
    fun main() {
        val user = User()
        user.setName("Alice")
        user.setName("Bob")
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */