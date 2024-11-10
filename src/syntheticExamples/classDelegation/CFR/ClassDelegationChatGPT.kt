package syntheticExamples.classDelegation.CFR

interface Base {
    fun printMessage()
}

class BaseImpl(private val message: String) : Base {
    override fun printMessage() {
        println(message)
    }
}

class Derived(base: Base) : Base by base

object ClassDelegation {
    @JvmStatic
    fun main(args: Array<String>) {
        val base = BaseImpl("Hello from BaseImpl")
        val derived = Derived(base)
        derived.printMessage()
    }
}
