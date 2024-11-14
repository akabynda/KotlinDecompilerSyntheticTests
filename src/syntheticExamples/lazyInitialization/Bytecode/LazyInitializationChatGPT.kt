package syntheticExamples.lazyInitialization.Bytecode

class LazyInitialization {
    val value: String by lazy {
        "Hello, Lazy Initialization!"
    }
}

fun main() {
    val instance = LazyInitialization()
    println(instance.value)
    println(instance.value) // This will not reinitialize the value
}
