package syntheticExamplesWoFixes.classDelegation

interface Base {
    fun printMessage()
}

class BaseImpl(val message: String) : Base {
    override fun printMessage() {
        println(message)
    }
}

class Derived(base: Base) : Base by base

fun main() {
    val base = BaseImpl("Hello from BaseImpl")
    val derived = Derived(base)
    derived.printMessage()
}
