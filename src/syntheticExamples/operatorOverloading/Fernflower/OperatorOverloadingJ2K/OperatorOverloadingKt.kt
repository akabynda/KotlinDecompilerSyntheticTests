package syntheticExamples.operatorOverloading.Fernflower.OperatorOverloadingJ2K

object OperatorOverloadingKt {
    fun main() {
        val v1 = Vector(1, 2)
        val v2 = Vector(3, 4)
        val v3 = v1.plus(v2)
        println(v3)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}