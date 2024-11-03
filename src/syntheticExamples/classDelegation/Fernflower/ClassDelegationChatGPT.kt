package syntheticExamples.classDelegation.Fernflower

interface Base {
    fun printMessage()
}

class BaseImpl(private val message: String) : Base {
    fun getMessage(): String = message

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

