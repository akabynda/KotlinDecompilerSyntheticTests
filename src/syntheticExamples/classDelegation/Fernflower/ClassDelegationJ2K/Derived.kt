package syntheticExamples.classDelegation.Fernflower.ClassDelegationJ2K

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0001¨\u0006\u0006"],
    d2 = ["LsyntheticExamples/classDelegation/Derived;", "LsyntheticExamples/classDelegation/Base;", "base", "(LsyntheticExamples/classDelegation/Base;)V", "printMessage", "", "KotlinDecompiler"]
)
 */
class Derived(base: Base) : Base {
    // $FF: synthetic field
    private val `$$delegate_0`: Base

    init {
        Intrinsics.checkNotNullParameter(base, "base")
        // unnecessary line: super()
        this.`$$delegate_0` = base
    }

    override fun printMessage() {
        `$$delegate_0`.printMessage()
    }
}