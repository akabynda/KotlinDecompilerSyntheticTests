package syntheticExamplesWoFixes.safeCast.Fernflower

object SafeCastJ2K {
    fun main() {
        val obj: Any = "String"
        val num = if (obj is Int) obj else null
        println(num)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}