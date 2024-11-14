package syntheticExamples.builder.Bytecode

fun buildList(block: (MutableList<Int>) -> Unit): List<Int> {
    val list = ArrayList<Int>()
    block(list)
    return list
}

fun main() {
    val numbers = buildList {
        it.add(1)
        it.add(2)
        it.add(3)
    }
    println(numbers)
}
