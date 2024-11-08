package syntheticExamples.singleton.JDGUI.SingletonJ2K

class Singleton {
    fun doSomething() {
        println("Do something")
    }

    companion object {
        val INSTANCE: Singleton = Singleton()
    }
}