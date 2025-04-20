package syntheticExamples.lazyInitialization.CFR.LazyInitializationJ2K

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 82,
    d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"],
    d2 = ["LsyntheticExamples/lazyInitialization/LazyInitialization;", "", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "value\$delegate", "Lkotlin/Lazy;", "KotlinDecompiler"]
)
 */

// not working
/*
class LazyInitialization {
    private val `value$delegate`: Lazy<*> = lazy<Any>(value as Function0<*>)
    val value: String
        get() {
            val lazy = this.`value$delegate`
            return lazy.value as String
        }
}
 */