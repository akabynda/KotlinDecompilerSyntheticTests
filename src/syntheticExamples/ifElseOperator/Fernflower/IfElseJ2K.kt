package syntheticExamples.ifElseOperator.Fernflower

object IfElseJ2K {
    fun main() {
        // int number = true; // original error
        val number = true
        val var1 = "Число больше 5"
        println(var1)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
