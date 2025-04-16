package syntheticExamplesWoFixes.elvis.CFR

object ElvisJ2K {
    fun main() {
        val str: Any? = null
        val result = "Default value"
        println(result as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}