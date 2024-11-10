package syntheticExamples.builder.CFR

fun buildList(block: (MutableList<Int>) -> Unit): List<Int> {
    val list = ArrayList<Int>()
    block(list)
    return list
}

fun main() {
    val numbers = buildList { list ->
        list.add(1)
        list.add(2)
        list.add(3)
    }
    println(numbers)
}
