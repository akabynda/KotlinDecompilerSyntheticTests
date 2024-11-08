package syntheticExamples.simpleLambda.JDGUI

fun main() {
    val arrayOfInteger = arrayOf(1, 2, 3, 4, 5)
    val numbers = arrayOfInteger.toList()

    numbers.forEach {
        val n = it
        val i = n * n
        println(i)
    }
}
