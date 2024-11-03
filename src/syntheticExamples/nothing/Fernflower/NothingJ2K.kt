package syntheticExamples.nothing.Fernflower

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"],
    d2 = ["fail", "", "message", "", "main", "", "KotlinDecompiler"]
)
 */
object NothingJ2K {
    fun fail(message: String): Void {
        Intrinsics.checkNotNullParameter(message, "message")
        throw IllegalArgumentException(message)
    }

    fun main() {
        fail("An error occurred")
        // throw KotlinNothingValueException()
        throw IllegalArgumentException()
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}