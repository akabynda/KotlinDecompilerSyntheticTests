package syntheticExamples.classDelegation.CFR.ClassDelegationJ2K

import kotlin.jvm.internal.Intrinsics

class Derived
    (base: Base) : Base {
    private  /* synthetic */val `$$delegate_0`: Base

    init {
        Intrinsics.checkNotNullParameter(base as Any, "base")
        this.`$$delegate_0` = base
    }

    override fun printMessage() {
        `$$delegate_0`.printMessage()
    }
}
