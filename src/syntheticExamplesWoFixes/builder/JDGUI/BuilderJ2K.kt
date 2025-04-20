/*    */
/*
package syntheticExamplesWoFixes.builder.JDGUI

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.Lambda

/*    */ /*    */
/*    */ /*    */ /*    */ /*    */ /*    */ /*    */ /*    */ /*    */ /*    */
object BuilderKt {
    /*    */
    /*    */ fun buildList(block: Function1<*, *>): List<Int?> {
        /*  4 */
        Intrinsics.checkNotNullParameter(block, "block")
        /*  4 */
        val list: List<Int?> = ArrayList<Any?>()
        /*  5 */
        block.invoke(list)
        /*  6 */
        return list
        /*    */
    }

    /*    */ /*    */
    fun main() {
        /* 10 */
        val numbers = buildList(`BuilderKt$main$numbers$1`.INSTANCE)
        /* 15 */
        println(numbers)
        /*    */
    }

    /*    */ /*    */
    /*    */
    internal class `BuilderKt$main$numbers$1`  /*    */ /*    */
    /*    */ : Lambda<Any?>(1),
        Function1<List<Int?>?, Unit> {
        /*    */ /*    */
        override fun invoke(`$this$buildList`: MutableList<Int?>) {
            /*    */
            Intrinsics.checkNotNullParameter(`$this$buildList`, "\$this\$buildList")
            /*    */
            `$this$buildList`.add(1)
            /*    */
            `$this$buildList`.add(2)
            /*    */
            `$this$buildList`.add(3)
            /*    */
        }

        companion object {
            /*    */
            val INSTANCE: `BuilderKt$main$numbers$1` = `BuilderKt$main$numbers$1`()
        }
    } /*    */
} /* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/builder/BuilderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */