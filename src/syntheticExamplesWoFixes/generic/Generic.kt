package syntheticExamplesWoFixes.generic

class Box<T>(val value: T)

fun main() {
    val box = Box("Hello")
    println(box.value)
}
