package syntheticExamples.lazyInitialization.JDGUI.LazyInitializationJ2K

object LazyInitializationJ2K {
    fun main() {
        val instance = LazyInitialization()
        println(instance.value)
        println(instance.value)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
