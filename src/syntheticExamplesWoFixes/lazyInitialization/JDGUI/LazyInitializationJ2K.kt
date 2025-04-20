/*
package syntheticExamplesWoFixes.lazyInitialization.JDGUI

import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.Lambda

class LazyInitialization {
    private val `value$delegate`: Lazy<*> = lazy<String>(`LazyInitialization$value$2`.INSTANCE)

    val value: String
        get() {
            val lazy = this.`value$delegate`
            return lazy.value as String
        }

    internal class `LazyInitialization$value$2` : Lambda<Any?>(0),
        Function0<String?> {
        override fun invoke(): String {
            println("Initializing")
            return "Initialized"
        }

        companion object {
            val INSTANCE: `LazyInitialization$value$2` = `LazyInitialization$value$2`()
        }
    }
}

final class LazyInitializationKt {
    fun main() {
        val instance = LazyInitialization()
        println(instance.value)
        println(instance.value)
    }

 */