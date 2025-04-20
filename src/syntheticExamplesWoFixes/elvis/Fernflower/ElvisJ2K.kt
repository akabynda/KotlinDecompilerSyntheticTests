package syntheticExamplesWoFixes.elvis.Fernflower

object ElvisJ2K {
    fun main() {
        val str: String? = null
        val result = "Default value"
        println(result)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}