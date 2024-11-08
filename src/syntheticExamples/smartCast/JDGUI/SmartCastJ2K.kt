package syntheticExamples.smartCast.JDGUI

object SmartCastJ2K {
    fun main() {
        val obj: Any = "String"
        val i = (obj as String).length
        println(i)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}