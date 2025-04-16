package syntheticExamplesWoFixes.singleton.CFR

class Singleton private constructor() {
    fun doSomething() {
        println("Do something" as Any)
    }

    companion object {
        val INSTANCE: Singleton = Singleton()
    }
}

object SingletonJ2K {
    fun main() {
        Singleton.INSTANCE.doSomething()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
