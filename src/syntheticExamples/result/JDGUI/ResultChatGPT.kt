package syntheticExamples.result.JDGUI

fun getResult(value: Int): Result<Int> {
    return if (value > 0) {
        Result.success(value)
    } else {
        Result.failure(Exception("Value must be positive"))
    }
}

fun main() {
    val result = getResult(-1)
    if (result.isSuccess) {
        val i = result.getOrNull()!!
        println("Success: $i")
    } else {
        val exception = result.exceptionOrNull()!!
        println("Error: ${exception.message}")
    }
}
