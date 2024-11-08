package syntheticExamples.classDelegation.JDGUI.ClassDelegationJ2K

class BaseImpl(val message: String) : Base {
    override fun printMessage() {
        println(this.message)
    }
}
