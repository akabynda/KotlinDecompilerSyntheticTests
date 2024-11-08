package syntheticExamples.nothing.JDGUI

import kotlin.jvm.internal.Intrinsics

object NothingJ2K {
    fun fail(message: String): Void {
        Intrinsics.checkNotNullParameter(message, "message")
        throw IllegalArgumentException(message)
    }

    fun main() {
        fail("An error occurred")
    }
}