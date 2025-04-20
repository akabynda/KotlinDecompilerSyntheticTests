/*
package syntheticExamplesWoFixes.simpleLambda.Fernflower

import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lambda.kt\nsyntheticExamplesWoFixes/simpleLambda/LambdaKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1855#2,2:8\n*S KotlinDebug\n*F\n+ 1 Lambda.kt\nsyntheticExamplesWoFixes/simpleLambda/LambdaKt\n*L\n5#1:8,2\n*E\n"])
object LambdaKt {
    fun main() {
        val var1 = arrayOf(1, 2, 3, 4, 5)
        val numbers: List<*> = listOf(*var1)
        val `$this$forEach$iv` = numbers as Iterable<*>
        val `$i$f$forEach`: Int = false.toInt()
        val var3 = `$this$forEach$iv`.iterator()

        while (var3.hasNext()) {
            val `element$iv` = var3.next()!!
            val n = (`element$iv` as Number).toInt()
            val var6: Int = false.toInt()
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
 */