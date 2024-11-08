package syntheticExamples.sequenceProcessing.JDGUI

import kotlin.jvm.internal.Lambda

object SequenceProcessingJ2K {
    fun main() {
        val arrayOfInteger = arrayOfNulls<Int>(5)
        arrayOfInteger[0] = 1
        arrayOfInteger[1] = 2
        arrayOfInteger[2] = 3
        arrayOfInteger[3] = 4
        arrayOfInteger[4] = 5
        /*
        val numbers: List<*> =
            sequenceOf(arrayOfInteger as Array<Any?>).filter<T>(SequenceProcessingJ2KMainNumbers1.INSTANCE)
                .map<T, R>(
                    SequenceProcessingJ2KMainNumbers2.INSTANCE
                ).toList<T>()
        */
        val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(numbers)
    }

    internal class SequenceProcessingJ2KMainNumbers1 : Lambda<Boolean?>(1),
        Function1<Int?, Boolean?> {
        override fun invoke(p1: Int?): Boolean {
            return ((p1 ?: 0) % 2 == 0)
        }

        companion object {
            val INSTANCE: SequenceProcessingJ2KMainNumbers1 =
                SequenceProcessingJ2KMainNumbers1()
        }
    }

    internal class SequenceProcessingJ2KMainNumbers2 : Lambda<Int?>(1),
        Function1<Int?, Int?> {
        override fun invoke(p1: Int?): Int {
            return (p1 ?: 0) * (p1 ?: 0)
        }

        companion object {
            val INSTANCE: SequenceProcessingJ2KMainNumbers2 =
                SequenceProcessingJ2KMainNumbers2()
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}