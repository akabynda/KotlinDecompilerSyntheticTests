package syntheticExamples.lazyInitialization.JDGUI.LazyInitializationJ2K

// doesn't work: 'syntheticExamples/lazyInitialization/JDGUI/LazyInitializationJ2K/LazyInitialization.LazyInitializationValue2' but 'kotlin/Function0<T>' was expected
/*
import kotlin.Lazy
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.Lambda

class LazyInitialization {
    private val valueDelegate: Lazy<String> = lazy(LazyInitializationValue2.INSTANCE)

    val value: String
        get() {
            return valueDelegate.value
        }

    internal class LazyInitializationValue2 : Lambda<String>(0), Function0<String> {
        override fun invoke(): String {
            println("Initializing")
            return "Initialized"
        }

        companion object {
            val INSTANCE = LazyInitializationValue2()
        }
    }
}
 */


class LazyInitialization {
    private val valueDelegate: Lazy<String> = lazy {
        println("Initializing")
        "Initialized"
    }

    val value: String
        get() = valueDelegate.value
}

fun main() {
    val instance = LazyInitialization()
    println(instance.value)
}
