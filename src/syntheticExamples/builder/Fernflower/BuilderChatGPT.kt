package syntheticExamples.builder.Fernflower

// Define the buildList function that takes a lambda to build the list
fun buildList(block: (MutableList<Int>) -> Unit): List<Int> {
    val list = ArrayList<Int>()
    block(list)
    return list
}

// The main function to execute the example
fun main() {
    val numbers: List<Int> = buildList(::addNumbers)
    println(numbers)
}

// A helper function that adds numbers to the list
private fun addNumbers(list: MutableList<Int>) {
    list.add(1)
    list.add(2)
    list.add(3)
}
