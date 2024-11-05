package syntheticExamples.reified.CFR

import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(value = ["SMAP\nReified.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reified.kt\nsyntheticExamples/reified/ReifiedKt\n*L\n1#1,10:1\n4#1:11\n*S KotlinDebug\n*F\n+ 1 Reified.kt\nsyntheticExamples/reified/ReifiedKt\n*L\n8#1:11\n*E\n"])
object ReifiedJ2K {
    /* synthetic */ fun <T> getTypeName(): String {
        val `$i$f$getTypeName` = false
        Intrinsics.reifiedOperationMarker(4, "T")
        val string = Any::class.java.simpleName
        Intrinsics.checkNotNullExpressionValue(string as Any, "getSimpleName(...)")
        return string
    }

    fun main() {
        val `$i$f$getTypeName` = false
        val string = String::class.java.simpleName
        Intrinsics.checkNotNullExpressionValue(string as Any, "getSimpleName(...)")
        val string2 = string
        println(string2 as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}