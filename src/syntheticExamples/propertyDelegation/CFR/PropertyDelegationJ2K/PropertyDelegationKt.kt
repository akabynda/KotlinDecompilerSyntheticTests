package syntheticExamples.propertyDelegation.CFR.PropertyDelegationJ2K

// It doesn't work correctly

object PropertyDelegationKt {
    fun main() {
        val user = User()
        user.name = "Alice"
        user.name = "Bob"
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}