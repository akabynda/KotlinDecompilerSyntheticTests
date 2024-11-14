package syntheticExamples.generic.Bytecode

class Box<T>(private val value: T) {
    fun getValue(): T = value
}

fun main() {
    val box = Box("Hello")
    println(box.getValue())
}
