/*
package syntheticExamplesWoFixes.nothing.JDGUI

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
}

 */