package syntheticExamples.tailRecursion.Fernflower

fun sum(n: Int, acc: Int = 0): Int {
    var currentN = n
    var currentAcc = acc
    while (currentN != 0) {
        currentN -= 1
        currentAcc += currentN
    }
    return currentAcc
}

fun main() {
    val result = sum(10000)
    println(result)
}
