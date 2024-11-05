package syntheticExamples.singleton.CFR.SingletonJ2K

object SingletonKt {
    fun main() {
        Singleton.INSTANCE.doSomething()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
