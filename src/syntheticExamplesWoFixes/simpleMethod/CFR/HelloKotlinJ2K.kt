package syntheticExamplesWoFixes.simpleMethod.CFR

object HelloKotlinJ2K {
    fun main() {
        println("\u041f\u0440\u0438\u0432\u0435\u0442, Kotlin!" as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}