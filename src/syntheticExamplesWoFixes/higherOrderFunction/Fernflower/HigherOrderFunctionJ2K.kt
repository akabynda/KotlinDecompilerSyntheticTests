package syntheticExamplesWoFixes.higherOrderFunction.Fernflower

import kotlin.jvm.functions.Function1
import kotlin.reflect.KParameter

object HigherOrderFunctionKt {
    fun main() {
        val square = KParameter.Kind.INSTANCE as Function1<*, *>
        val result = (square.invoke(5 as Nothing) as Number).toInt()
        println(result)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}