package syntheticExamples.classDelegation.Bytecode

interface Base {
    fun printMessage()
}

class BaseImpl(private val message: String) : Base {
    override fun printMessage() {
        println(message)
    }
}

class Derived(private val base: Base) : Base by base

fun main() {
    val base = BaseImpl("Hello from BaseImpl")
    val derived = Derived(base)
    derived.printMessage()
}
