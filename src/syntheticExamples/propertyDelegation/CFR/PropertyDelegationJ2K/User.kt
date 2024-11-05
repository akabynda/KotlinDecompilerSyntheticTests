package syntheticExamples.propertyDelegation.CFR.PropertyDelegationJ2K

// It doesn't work correctly

import kotlin.jvm.internal.MutablePropertyReference1
import kotlin.jvm.internal.MutablePropertyReference1Impl
import kotlin.jvm.internal.Reflection
import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class User {
    private val `name$delegate`: ReadWriteProperty<*, *>

    var name: String = ""
        /*
        get() = `name$delegate`.getValue(
            this as Any,
            `$$delegatedProperties`[0]
        ) as String
        set(string) {
            Intrinsics.checkNotNullParameter(string as Any, "<set-?>")
            `name$delegate`.setValue(
                this as Any,
                `$$delegatedProperties`[0], string as Any
            )
        }
         */

    init {
        val delegates = Delegates
        val `initialValue$iv` = "<not set>"
        val `$i$f$observable` = false
        this.`name$delegate` = object : ObservableProperty<String?>(`initialValue$iv`) {
        }
    }

    companion object {
        // /* synthetic */val `$$delegatedProperties`: Array<KProperty<Any>>

        init {
            val kPropertyArray = arrayOf<KProperty<*>>(
                Reflection.mutableProperty1(
                    MutablePropertyReference1Impl(
                        User::class.java, "name", "getName()Ljava/lang/String;", 0
                    ) as MutablePropertyReference1
                )
            )
            // `$$delegatedProperties` = kPropertyArray
        }
    }
}