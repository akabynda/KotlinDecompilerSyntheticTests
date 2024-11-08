package syntheticExamples.reified.JDGUI

import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nReified.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reified.kt\nsyntheticExamples/reified/ReifiedKt\n*L\n1#1,10:1\n4#1:11\n*S KotlinDebug\n*F\n+ 1 Reified.kt\nsyntheticExamples/reified/ReifiedKt\n*L\n8#1:11\n*E\n"])
object ReifiedJ2K {
    fun main() {
        val `$i$f$getTypeName` = 0
        Intrinsics.checkNotNullExpressionValue(String::class.java.simpleName, "getSimpleName(...)")
        val str = String::class.java.simpleName
        println(str)
    }
}