package syntheticExamplesWoFixes.lazyInitialization

class LazyInitialization {
    val value: String by lazy {
        println("Initializing")
        "Initialized"
    }
}

fun main() {
    val instance = LazyInitialization()
    println(instance.value)
    println(instance.value)
}