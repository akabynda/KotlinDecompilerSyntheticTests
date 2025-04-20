package syntheticExamplesWoFixes.nullValueSafety.Fernflower

object NullValueSafetyKt {
    fun main() {
        val text: String? = null
        val var1: Any? = null
        println(var1)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}