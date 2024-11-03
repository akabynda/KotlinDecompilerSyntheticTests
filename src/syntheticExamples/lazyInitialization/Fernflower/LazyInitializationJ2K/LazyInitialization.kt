package syntheticExamples.lazyInitialization.Fernflower.LazyInitializationJ2K

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\u000c\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"],
    d2 = ["LsyntheticExamples/lazyInitialization/LazyInitialization;", "", "()V", "value", "", "getValue", "()Ljava/lang/String;", "value\$delegate", "Lkotlin/Lazy;", "KotlinDecompiler"]
)
 */
class LazyInitialization {
    private val `value$delegate`: Lazy<*> = lazy { value_delegate() }

    val value: String
        get() {
            val var1 = this.`value$delegate`
            val var2: Any? = null
            return var1.value as String
        }

    companion object {
        private fun value_delegate(): String {
            val var0 = "Initializing"
            println(var0)
            return "Initialized"
        }
    }
}