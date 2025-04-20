/*
package syntheticExamplesWoFixes.propertyDelegation.JDGUI

import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.MutablePropertyReference1Impl
import kotlin.jvm.internal.Reflection
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

@SourceDebugExtension(["SMAP\nPropertyDelegation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,15:1\n33#2,3:16\n*S KotlinDebug\n*F\n+ 1 PropertyDelegation.kt\nsyntheticExamplesWoFixes/propertyDelegation/User\n*L\n6#1:16,3\n*E\n"])
class User {
    private val `name$delegate`: ReadWriteProperty<*, *>

    init {
        val delegates = Delegates
        val `initialValue$iv`: Any = "<not set>"
        val `$i$f$observable` = 0
        this.`name$delegate` =
            `User$special$$inlined$observable$1`(`initialValue$iv`) as ReadWriteProperty<*, *>
    }

    val name: String
        get() = `name$delegate`.getValue(this, `$$delegatedProperties`.get(0)) as String

    fun setName() {
        if (Intrinsics.checkNotNullParameter(TODO("Cannot convert element")) < set -)
            "<set-?>"
        if (`name$delegate`.setValue(this, `$$delegatedProperties`.get(0), TODO("Cannot convert element")) < set -)
    }

    companion object {
        init {
            val arrayOfKProperty: Array<KProperty<*>> = arrayOfNulls(1)
            arrayOfKProperty[0] = Reflection.mutableProperty1(
                MutablePropertyReference1Impl(
                    User::class.java, "name", "getName()Ljava/lang/String;", 0
                )
            )
            `$$delegatedProperties` = arrayOfKProperty as Array<KProperty<Any?>>
        }
    }
}

object PropertyDelegationKt {
    fun main() {
        val user = syntheticExamplesWoFixes.propertyDelegation.JDGUI.Decompilation.User()
        user.setName("Alice")
        user.setName("Bob")
    }
}
 */