package syntheticExamples.sequenceProcessing.CFR

object SequenceProcessingJ2K {
    fun main() {
        val objectArray: Array<Int> = arrayOf<Int>(1, 2, 3, 4, 5)
        // doesn't work
        // List numbers2 = SequencesKt.toList((Sequence)SequencesKt.map((Sequence)SequencesKt.filter((Sequence)SequencesKt.sequenceOf((Object[])objectArray), (Function1)main.numbers.1.INSTANCE), (Function1)main.numbers.2.INSTANCE));
        // System.out.println(numbers2);
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}