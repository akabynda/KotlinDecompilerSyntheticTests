package syntheticExamples.classDelegation.Fernflower.ClassDelegationJ2K

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"],
    d2 = ["LsyntheticExamples/classDelegation/BaseImpl;", "LsyntheticExamples/classDelegation/Base;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "printMessage", "", "KotlinDecompiler"]
)
 */
class BaseImpl(message: String) : Base {
    val message: String

    init {
        Intrinsics.checkNotNullParameter(message, "message")
        // unnecessary line: super()
        this.message = message
    }

    override fun printMessage() {
        val var1 = this.message
        println(var1)
    }
}