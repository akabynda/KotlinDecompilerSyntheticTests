package syntheticExamples.generic.CFR

class Box<T>(val value: T)

fun main() {
    val box: Box<String> = Box("Hello")
    println(box.value)
}
