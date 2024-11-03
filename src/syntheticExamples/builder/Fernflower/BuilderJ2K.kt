package syntheticExamples.builder.Fernflower

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001d\u0010\u0003\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u001a\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"],
    d2 = ["buildList", "", "", "block", "Lkotlin/Function1;", "", "", "Lkotlin/ExtensionFunctionType;", "main", "KotlinDecompiler"]
)
 */
object BuilderJ2K {
    // fun <T> buildList(block: Function1<MutableList<T>?, Unit>): List<T> {
    fun <T> buildList(block: Function1<MutableList<T>, Unit>): List<T> {
    Intrinsics.checkNotNullParameter(block, "block")
        // val list: List<T> = ArrayList()
        val list: MutableList<T> = ArrayList()
        block.invoke(list)
        return list
    }

    fun main() {
        val numbers =
            // buildList<Int> { obj: BuilderJ2K?, list: MutableList<Int> -> populateListWithIntegers(list) }
            buildList { list ->
                populateListWithIntegers(list)
            }
        println(numbers)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }

    private fun populateListWithIntegers(list: MutableList<Int>) {
        Intrinsics.checkNotNullParameter(list, "list")
        list.add(1)
        list.add(2)
        list.add(3)
        // return Unit
    }
}