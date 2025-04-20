package syntheticExamplesWoFixes.nullValueSafety.JDGUI

object NullValueSafetyJ2K {
    fun main() {
        val text: String? = null
        println(null as Any?)
    }
}

fun main(args: Array<String>) {
    NullValueSafetyJ2K.main()
}