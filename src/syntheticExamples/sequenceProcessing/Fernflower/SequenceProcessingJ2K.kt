package syntheticExamples.sequenceProcessing.Fernflower

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)
 */
object SequenceProcessingJ2K {
    fun main() {
        val var1 = arrayOf(1, 2, 3, 4, 5)
        val numbers: List<*> =
            /*
            sequenceOf(*var1).filter { obj: SequenceProcessingDecompiled?, it: Int -> `main$lambda$0`(it) }
                .map { obj: SequenceProcessingDecompiled?, it: Int -> `main$lambda$1`(it) }.toList()
             */
            sequenceOf(*var1).filter { `main$lambda$0`(it) }.map { `main$lambda$1`(it) }.toList()
        println(numbers)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }

    private fun `main$lambda$0`(it: Int): Boolean {
        return it % 2 == 0
    }

    private fun `main$lambda$1`(it: Int): Int {
        return it * it
    }
}