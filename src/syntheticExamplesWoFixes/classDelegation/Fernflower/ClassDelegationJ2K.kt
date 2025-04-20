/*
// Base.java
package syntheticExamplesWoFixes.classDelegation.Fernflower

import org.jetbrains.annotations.NotNull
import kotlin.jvm.internal.Intrinsics

interface Base {
    fun printMessage()
} // BaseImpl.java

class BaseImpl(@NotNull message: String) : Base {
    @get:NotNull
    @NotNull
    val message: String

    init {
        Intrinsics.checkNotNullParameter(message, "message")
        super()
        this.message = message
    }

    override fun printMessage() {
        val var1 = this.message
        println(var1)
    }
} // Derived.java

class Derived(@NotNull base: Base) : Base {
    // $FF: synthetic field
    private val `$$delegate_0`: Base

    init {
        Intrinsics.checkNotNullParameter(base, "base")
        super()
        this.`$$delegate_0` = base
    }

    override fun printMessage() {
        `$$delegate_0`.printMessage()
    }
} // ClassDelegationKt.java

object ClassDelegationKt {
    fun main() {
        val base = BaseImpl("Hello from BaseImpl")
        val derived = Derived(base as Base)
        derived.printMessage()
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */