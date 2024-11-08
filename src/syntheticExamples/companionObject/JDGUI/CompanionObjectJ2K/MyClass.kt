package syntheticExamples.companionObject.JDGUI.CompanionObjectJ2K

object MyClass {
    val companion: Companion = Companion()

    class Companion internal constructor() {
        fun greet() {
            println("Hello from companion object!")
        }
    }
}