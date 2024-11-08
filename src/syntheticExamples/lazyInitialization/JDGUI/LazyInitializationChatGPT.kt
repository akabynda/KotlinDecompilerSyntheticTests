package syntheticExamples.lazyInitialization.JDGUI

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
