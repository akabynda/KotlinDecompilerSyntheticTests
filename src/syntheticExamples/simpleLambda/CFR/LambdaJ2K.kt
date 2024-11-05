package syntheticExamples.simpleLambda.CFR

import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(value = ["SMAP\nLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lambda.kt\nsyntheticExamples/simpleLambda/LambdaDecompiled\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,7:1\n1863#2,2:8\n*S KotlinDebug\n*F\n+ 1 Lambda.kt\nsyntheticExamples/simpleLambda/LambdaDecompiled\n*L\n5#1:8,2\n*E\n"])
object LambdaJ2K {
    fun main() {
        val objectArray: Array<Int> = arrayOf<Int>(1, 2, 3, 4, 5)
        val numbers: List<*> = listOf(*objectArray)
        val `$this$forEach$iv`: Iterable<*> = numbers
        val `$i$f$forEach` = false
        for (`element$iv` in `$this$forEach$iv`) {
            val n = (`element$iv` as Number).toInt()
            val bl = false
            val n2 = n * n
            println(n2)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}