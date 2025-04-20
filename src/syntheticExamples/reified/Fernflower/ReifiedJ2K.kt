package syntheticExamples.reified.Fernflower

import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001a\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"],
    d2 = ["getTypeName", "", "T", "main", "", "KotlinDecompiler"]
)
 */
@SourceDebugExtension(["SMAP\nReified.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reified.kt\nsyntheticExamples/reified/ReifiedKt\n*L\n1#1,10:1\n4#1:11\n*S KotlinDebug\n*F\n+ 1 Reified.kt\nsyntheticExamples/reified/ReifiedKt\n*L\n8#1:11\n*E\n"])
object ReifiedJ2K {
    val typeName: String
        // $FF: synthetic method
        get() {
            // int $i$f$getTypeName = false;
            val `$i$f$getTypeName` = false
            Intrinsics.reifiedOperationMarker(4, "T")
            val var1 = (Any::class.java as Class<*>).simpleName
            Intrinsics.checkNotNullExpressionValue(var1, "getSimpleName(...)")
            return var1 as String
        }

    fun main() {
        // int $i$f$getTypeName = false;
        val `$i$f$getTypeName` = false
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