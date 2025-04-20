/*
// Singleton.java
package syntheticExamplesWoFixes.singleton.Fernflower

class Singleton private constructor() {
    fun doSomething() {
        val var1 = "Do something"
        println(var1)
    }

    companion object {
        val INSTANCE: Singleton = syntheticExamplesWoFixes.singleton.Singleton()
    }
} // SingletonKt.java

object SingletonKt {
    fun main() {
        Singleton.Companion.INSTANCE.doSomething()
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */