package syntheticExamples.nullValueSafety.CFR

object NullValueSafetyJ2K {
    fun main() {
        val text: Any? = null
        println(null as Any?)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}