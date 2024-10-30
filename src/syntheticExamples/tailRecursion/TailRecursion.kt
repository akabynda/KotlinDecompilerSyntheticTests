package syntheticExamples.tailRecursion

tailrec fun sum(n: Int, acc: Int = 0): Int {
    return if (n == 0) acc else sum(n - 1, acc + n)
}

fun main() {
    println(sum(10000))
}
