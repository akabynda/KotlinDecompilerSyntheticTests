package syntheticExamples.singleton.CFR.SingletonJ2K

class Singleton private constructor() {
    fun doSomething() {
        println("Do something" as Any)
    }

    companion object {
        val INSTANCE: Singleton = Singleton()
    }
}
