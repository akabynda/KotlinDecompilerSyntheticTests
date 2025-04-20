package syntheticExamples.safeCast.JDGUI

object SafeCastJ2K {
    fun main() {
        val obj: Any = "String"
        val num = if ((obj is Int)) obj else null
        println(num)
    }
}