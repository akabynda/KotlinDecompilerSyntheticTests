/*
package syntheticExamplesWoFixes.sequenceProcessing.JDGUI.Decompilation

import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.Lambda


object SequenceProcessingKt {
    fun main() {
        val arrayOfInteger = arrayOfNulls<Int>(5)
        arrayOfInteger[0] = 1
        arrayOfInteger[1] = 2
        arrayOfInteger[2] = 3
        arrayOfInteger[3] = 4
        arrayOfInteger[4] = 5
        val numbers: List<*> =
            sequenceOf<Any>(*(arrayOfInteger as Array<Any?>)).filter<T>(`SequenceProcessingKt$main$numbers$1`.INSTANCE)
                .map<T, R>(
                    `SequenceProcessingKt$main$numbers$2`.INSTANCE
                ).toList<T>()
        println(numbers)
    }

    internal class `SequenceProcessingKt$main$numbers$1` : Lambda<Any?>(1),
        Function1<Int?, Boolean?> {
        fun invoke(it: Int): Boolean {
            return (it % 2 == 0)
        }

        companion object {
            val INSTANCE: `SequenceProcessingKt$main$numbers$1` = `SequenceProcessingKt$main$numbers$1`()
        }
    }


    internal class `SequenceProcessingKt$main$numbers$2` : Lambda<Any?>(1),
        Function1<Int?, Int?> {
        fun invoke(it: Int): Int {
            return it * it
        }

        companion object {
            val INSTANCE: `SequenceProcessingKt$main$numbers$2` = `SequenceProcessingKt$main$numbers$2`()
        }
    }
}

 */