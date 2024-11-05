package syntheticExamples.smartCast.CFR

object SmartCastJ2K {
    fun main() {
        val obj = "String"
        val n = obj.length
        println(n)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}