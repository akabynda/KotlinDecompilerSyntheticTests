package syntheticExamples.builder

fun buildList(block: MutableList<Int>.() -> Unit): List<Int> {
    val list = mutableListOf<Int>()
    list.block()
    return list
}

fun main() {
    val numbers = buildList {
        add(1)
        add(2)
        add(3)
    }
    println(numbers)
}
