package syntheticExamplesWoFixes.singleton.JDGUI

class Singleton {
    fun doSomething() {
        println("Do something")
    }

    companion object {
        val INSTANCE: Singleton = Singleton()
    }
}

object SingletonJ2K {
    fun main() {
        Singleton.INSTANCE.doSomething()
    }
}

fun main() {
    SingletonJ2K.main()
}