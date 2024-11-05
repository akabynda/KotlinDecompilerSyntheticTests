package syntheticExamples.result.CFR

// doesn't work

/*
object ResultDecompiled {
    fun getResult(value: Int): Any {
        return if (value > 0) constructor - impl(value as Any) else constructor - impl(
            kotlin.ResultDecompiled.createFailure(
                Exception("Value must be positive") as Throwable
            ) as Any
        )
    }

    fun main() {
        block1@{
            val throwable: Throwable
            val result = getResult(-1)
            val `object` = result
            if (isSuccess - impl(`object`)) {
                val it = (`object` as Number).toInt()
                val bl = false
                println(("Success: $it") as Any)
            }
            val throwable2: Throwable = exceptionOrNull - impl(`object`) ?: break@block1
            throwable = throwable2
            val it = throwable
            val bl = false
            println(("Error: " + it.message) as Any)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}

 */