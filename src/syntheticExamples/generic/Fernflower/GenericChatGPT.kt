package syntheticExamples.generic.Fernflower

class Box<T>(val value: T)

fun main() {
    val box = Box("Hello")
    val value: String = box.value
    println(value)
}

