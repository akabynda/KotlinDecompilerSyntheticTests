package syntheticExamples.simpleLambda.Fernflower

import kotlin.jvm.internal.SourceDebugExtension

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)
 */
@SourceDebugExtension(["SMAP\nLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lambda.kt\nlambda/LambdaKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1863#2,2:8\n*S KotlinDebug\n*F\n+ 1 Lambda.kt\nlambda/LambdaKt\n*L\n5#1:8,2\n*E\n"])
object LambdaJ2K {
    fun main() {
        val var1 = arrayOf(1, 2, 3, 4, 5)
        val numbers: List<*> = listOf(*var1)
        val `$this$forEach$iv` = numbers as Iterable<*>
        val `$i$f$forEach` = false
        val var3 = `$this$forEach$iv`.iterator()

        while (var3.hasNext()) {
            val `element$iv` = var3.next()!!
            val n = (`element$iv` as Number).toInt()
            val var6 = false
            val var7 = n * n
            println(var7)
        }
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}