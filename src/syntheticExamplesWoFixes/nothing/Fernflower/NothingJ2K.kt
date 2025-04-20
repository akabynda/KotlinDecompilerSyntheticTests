/*
package syntheticExamplesWoFixes.nothing.Fernflower

import kotlin.jvm.internal.Intrinsics

object NothingKt {
    fun fail(message: String): Void {
        Intrinsics.checkNotNullParameter(message, "message")
        throw IllegalArgumentException(message)
    }

    fun main() {
        fail("An error occurred")
        throw KotlinNothingValueException()
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */