package syntheticExamples.singleton.JDGUI.SingletonJ2K

object SingletonJ2K {
    fun main() {
        Singleton.INSTANCE.doSomething()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}