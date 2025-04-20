package syntheticExamples.companionObject.Fernflower.CompanionObjectJ2K

import kotlin.jvm.internal.DefaultConstructorMarker

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"],
    d2 = ["LsyntheticExamples/companionObject/MyClass;", "", "()V", "Companion", "KotlinDecompiler"]
)
 */
object MyClass {
    // val Companion: Companion = Companion(null as DefaultConstructorMarker?)
    val companion: Companion = Companion(null as DefaultConstructorMarker?)

    /*
    @Metadata(
        mv = [2, 0, 0],
        k = 1,
        xi = 48,
        d1 = ["\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"],
        d2 = ["LsyntheticExamples/companionObject/MyClass\$Companion;", "", "()V", "greet", "", "KotlinDecompiler"]
    )
     */
    class Companion private constructor() {
        fun greet() {
            val var1 = "Hello from companion object!"
            println(var1)
        }

        // $FF: synthetic method
        constructor(`$constructor_marker`: DefaultConstructorMarker?) : this()
    }
}