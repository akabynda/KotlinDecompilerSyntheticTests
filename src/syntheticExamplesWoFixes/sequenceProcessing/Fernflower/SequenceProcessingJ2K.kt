/*
package syntheticExamplesWoFixes.sequenceProcessing.Fernflower

import kotlin.jvm.functions.Function1
import kotlin.reflect.KParameter

object SequenceProcessingKt {
    fun main() {
        val var1 = arrayOf(1, 2, 3, 4, 5)
        val numbers: List<*> = sequenceOf<Int>(*var1).filter<Int>(KParameter.Kind.INSTANCE as Function1<*, *>?)
            .map<Any, Any>(KParameter.Kind.INSTANCE as Function1<*, *>?).toList<Any>()
        println(numbers)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */