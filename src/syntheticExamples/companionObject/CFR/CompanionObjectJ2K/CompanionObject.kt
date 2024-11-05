package syntheticExamples.companionObject.CFR.CompanionObjectJ2K

object CompanionObject {
    fun main() {
        MyClass.companion.greet()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}