/*
package syntheticExamplesWoFixes.reified.Fernflower

import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nReified.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reified.kt\nsyntheticExamplesWoFixes/reified/ReifiedKt\n*L\n1#1,10:1\n4#1:11\n*S KotlinDebug\n*F\n+ 1 Reified.kt\nsyntheticExamplesWoFixes/reified/ReifiedKt\n*L\n8#1:11\n*E\n"])
object ReifiedKt {
    val typeName: String
        // $FF: synthetic method
        get() {
            val `$i$f$getTypeName`: Int = false.toInt()
            Intrinsics.reifiedOperationMarker(4, "T")
            val var1 = (Any::class.java as Class<*>).simpleName
            Intrinsics.checkNotNullExpressionValue(var1, "getSimpleName(...)")
            return var1 as String
        }

    fun main() {
        val `$i$f$getTypeName`: Int = false.toInt()
        val var1 = String::class.java.simpleName
        Intrinsics.checkNotNullExpressionValue(var1, "getSimpleName(...)")
        println(var1)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */