package syntheticExamples.nullValueSafety.JDGUI;

object NullValueSafetyJ2K {
    fun main() {
        val text: String? = null
        println(null as Any?)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}