/*
package syntheticExamplesWoFixes.higherOrderFunction.JDGUI

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Lambda

object HigherOrderFunctionKt {
    fun main() {
        val square: Function1<*, *> = `HigherOrderFunctionKt$main$square$1`.INSTANCE
        val result = (square.invoke(5) as Number).toInt()
        println(result)
    }

    internal class `HigherOrderFunctionKt$main$square$1` : Lambda<Any?>(1),
        Function1<Int?, Int?> {
        fun invoke(it: Int): Int {
            return it * it
        }

        companion object {
            val INSTANCE: `HigherOrderFunctionKt$main$square$1` = `HigherOrderFunctionKt$main$square$1`()
        }
    }
}
 */