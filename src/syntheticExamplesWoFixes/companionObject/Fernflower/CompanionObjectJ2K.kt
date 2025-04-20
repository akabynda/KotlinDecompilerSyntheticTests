/*
// MyClass.java
package syntheticExamplesWoFixes.companionObject.Fernflower

import kotlin.jvm.internal.DefaultConstructorMarker

object MyClass {
    val Companion: MyClass.Companion = MyClass.Companion(null as DefaultConstructorMarker?)


    class Companion private constructor() {
        fun greet() {
            val var1 = "Hello from companion object!"
            println(var1)
        }

        // $FF: synthetic method
        constructor(`$constructor_marker`: DefaultConstructorMarker?) : this()
    }
} // CompanionObjectKt.java

object CompanionObjectKt {
    fun main() {
        MyClass.greet()
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */