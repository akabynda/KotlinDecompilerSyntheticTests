package syntheticExamples.result.Bytecode

fun getResult(n: Int): Result<Int> {
    return if (n > 0) {
        Result.success(n)
    } else {
        Result.failure(Exception("Value must be positive"))
    }
}

fun main() {
    val result = getResult(-1)
    if (result.isSuccess) {
        val value = result.getOrNull()!!
        println("Success: $value")
    } else {
        val exception = result.exceptionOrNull()
        if (exception != null) {
            println("Error: ${exception.message}")
        }
    }
}
