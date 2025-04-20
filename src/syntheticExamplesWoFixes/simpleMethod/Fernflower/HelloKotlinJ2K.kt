package syntheticExamplesWoFixes.simpleMethod.Fernflower

object HelloKotlinJ2K {
    fun main() {
        val var0 = "Привет, Kotlin!"
        println(var0)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}