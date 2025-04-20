/*
package syntheticExamplesWoFixes.builder.Fernflower

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics

object BuilderJ2K {
    fun buildList(block: Function1<*, *>): List<*> {
        Intrinsics.checkNotNullParameter(block, "block")
        val list = (ArrayList<Any?>()) as List<*>
        block.invoke(list)
        return list
    }

    fun main() {
        val numbers = buildList(null.INSTANCE as Function1<*, *>)
        println(numbers)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}

 */