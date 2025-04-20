/*
// LazyInitialization.java
package syntheticExamplesWoFixes.lazyInitialization.Fernflower

import kotlin.jvm.functions.Function0
import kotlin.reflect.KParameter

class LazyInitialization {
    private val `value$delegate`: Lazy<*> = lazy<Any>(KParameter.Kind.INSTANCE as Function0<*>?)

    val value: String
        get() {
            val var1 = this.`value$delegate`
            val var2: Any? = null
            return var1.value as String
        }
} // LazyInitializationKt.java

object LazyInitializationKt {
    fun main() {
        val instance = LazyInitialization()
        var var1: String = instance.getValue()
        println(var1)
        var1 = instance.getValue()
        println(var1)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */