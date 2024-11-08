package syntheticExamples.propertyDelegation.JDGUI.PropertyDelegationJ2K

// doesn't work

/*
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.MutablePropertyReference1
import kotlin.jvm.internal.MutablePropertyReference1Impl
import kotlin.jvm.internal.Reflection
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class User {
    private val `name$delegate`: ReadWriteProperty<*, *>

    val name: String
        get() = `name$delegate`.getValue(this, `$$delegatedProperties`.get(0)) as String

    fun setName() {
        if (Intrinsics.checkNotNullParameter(TODO("Cannot convert element")) < set -)
            "<set-?>"

        if (`name$delegate`.setValue(this, `$$delegatedProperties`.get(0), TODO("Cannot convert element")) < set -)

    }

    init {
        val delegates = Delegates
        val `initialValue$iv`: Any = "<not set>"
        val `$i$f$observable` = 0
        this.`name$delegate` =
            `User$special$$inlined$observable$1`(`initialValue$iv`) as ReadWriteProperty<*, *>
    }

    companion object {
        init {
            val arrayOfKProperty: Array<KProperty<*>> = arrayOfNulls(1)
            arrayOfKProperty[0] = Reflection.mutableProperty1(
                MutablePropertyReference1Impl(
                    User::class.java, "name", "getName()Ljava/lang/String;", 0
                ) as MutablePropertyReference1
            ) as KProperty<*>
            `$$delegatedProperties` = arrayOfKProperty as Array<KProperty<Any?>>
        }
    }
}

 */