package syntheticExamples.result

fun getResult(value: Int): Result<Int> {
    return if (value > 0) {
        Result.success(value)
    } else {
        Result.failure(Exception("Value must be positive"))
    }
}

fun main() {
    val result = getResult(-1)
    result.onSuccess {
        println("Success: $it")
    }.onFailure {
        println("Error: ${it.message}")
    }
}