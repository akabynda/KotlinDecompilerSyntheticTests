package syntheticExamplesWoFixes.classDelegation.CFR

import kotlin.jvm.internal.Intrinsics

interface Base {
    fun printMessage()
}

class BaseImpl
    (message: String) : Base {
    val message: String

    init {
        Intrinsics.checkNotNullParameter(message as Any, "message")
        this.message = message
    }

    override fun printMessage() {
        println(message as Any)
    }
}

object ClassDelegationJ2K {
    fun main() {
        val base = BaseImpl("Hello from BaseImpl")
        val derived = Derived(base)
        derived.printMessage()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}

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
