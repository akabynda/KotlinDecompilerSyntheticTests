/*
package syntheticExamplesWoFixes.companionObject.CFR

import kotlin.jvm.internal.DefaultConstructorMarker

object CompanionObjectJ2K {
    fun main() {
        MyClass.Companion.greet()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}

object MyClass {
    val Companion: Companion = Companion(null)

    class Companion private constructor() {
        fun greet() {
            println("Hello from companion object!" as Any)
        }

        /* synthetic */constructor(`$constructor_marker`: DefaultConstructorMarker?) : this()
    }
}

 */