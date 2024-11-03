package syntheticExamples.reified.Fernflower

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
        val it = result.getOrNull()!!
        println("Success: $it")
    }

    val exception = result.exceptionOrNull()
    if (exception != null) {
        println("Error: ${exception.message}")
    }
}
