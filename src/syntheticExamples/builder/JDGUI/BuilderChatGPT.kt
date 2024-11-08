package syntheticExamples.builder.JDGUI

object BuilderChatGPT {
    fun buildList(block: (MutableList<Int>) -> Unit): List<Int> {
        val list = mutableListOf<Int>()
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

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
