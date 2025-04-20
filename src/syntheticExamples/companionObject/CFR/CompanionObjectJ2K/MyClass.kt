package syntheticExamples.companionObject.CFR.CompanionObjectJ2K

import kotlin.jvm.internal.DefaultConstructorMarker

object MyClass {
    val companion: Companion = Companion(null)

    /*
    @Metadata(
        mv = [2, 0, 0],
        k = 1,
        xi = 82,
        d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"],
        d2 = ["LsyntheticExamples/companionObject/MyClass\$Companion;", "", "<init>", "()V", "greet", "", "KotlinDecompiler"]
    )
     */
    class Companion private constructor() {
        fun greet() {
            println("Hello from companion object!" as Any)
        }

        /* synthetic */constructor(`$constructor_marker`: DefaultConstructorMarker?) : this()
    }
}
