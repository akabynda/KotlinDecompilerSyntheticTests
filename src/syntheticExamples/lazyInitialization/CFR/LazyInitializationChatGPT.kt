package syntheticExamples.lazyInitialization.CFR

class LazyInitializationChatGPT {
    val value: String by lazy {
        println("Initializing value")
        "Hello, Lazy"
    }
}

fun main() {
    val instance = LazyInitializationChatGPT()
    println(instance.value)
    println(instance.value)
}
