package syntheticExamples.higherOrderFunction.JDGUI

import kotlin.jvm.internal.Lambda

object HigherOrderFunctionJ2K {
    fun main() {
        val square: Function1<Int?, Int?> = HigherOrderFunctionJ2KMainSquare1.INSTANCE
        val result = square.invoke(5) ?: Int.MIN_VALUE
        println(result)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }

    internal class HigherOrderFunctionJ2KMainSquare1 : Lambda<Int?>(1), Function1<Int?, Int?>  {

        companion object {
            val INSTANCE: HigherOrderFunctionJ2KMainSquare1 =
                HigherOrderFunctionJ2KMainSquare1()
        }

        override fun invoke(p1: Int?): Int {
            return (p1?: Int.MIN_VALUE) * (p1 ?: Int.MIN_VALUE)
        }
    }
}
