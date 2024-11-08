package syntheticExamples.classDelegation.JDGUI.ClassDelegationJ2K

object ClassDelegation {
    fun main() {
        val base = BaseImpl("Hello from BaseImpl")
        val derived = Derived(base)
        derived.printMessage()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}