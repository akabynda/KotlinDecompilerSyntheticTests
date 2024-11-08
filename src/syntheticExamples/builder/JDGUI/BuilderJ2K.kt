package syntheticExamples.builder.JDGUI

import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Lambda

object BuilderJ2K {
    fun buildList(block: Function1<MutableList<Int?>, Unit>): List<Int?> {
        Intrinsics.checkNotNullParameter(block, "block")
        // val list: List<Int?> = ArrayList<Any?>()
        val list: MutableList<Int?> = ArrayList()
        block
            .invoke(list)
        return list
    }

    fun main() {
        val numbers = buildList(BuilderJ2KMainNumbers1.INSTANCE)
        println(numbers)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }

    internal class BuilderJ2KMainNumbers1 : Lambda<Unit>(1), Function1<MutableList<Int?>, Unit> {
        override fun invoke(`$this$buildList`: MutableList<Int?>) {
            Intrinsics.checkNotNullParameter(`$this$buildList`, "\$this\$buildList")
            `$this$buildList`.add(1)
            `$this$buildList`.add(2)
            `$this$buildList`.add(3)
        }

        companion object {
            val INSTANCE: BuilderJ2KMainNumbers1 = BuilderJ2KMainNumbers1()
        }
    }
}