package syntheticExamples.singleton.Fernflower.SingletonJ2K

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"],
    d2 = ["LsyntheticExamples/singleton/Singleton;", "", "()V", "doSomething", "", "KotlinDecompiler"]
)
 */
class Singleton private constructor() {
    fun doSomething() {
        val var1 = "Do something"
        println(var1)
    }

    companion object {
        val INSTANCE: Singleton = Singleton()
    }
}
