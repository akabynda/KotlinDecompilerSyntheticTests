package syntheticExamples.classDelegation.JDGUI.ClassDelegationJ2K

class Derived(private val `$$delegate_0`: Base) : Base {
    override fun printMessage() {
        `$$delegate_0`.printMessage()
    }
}
