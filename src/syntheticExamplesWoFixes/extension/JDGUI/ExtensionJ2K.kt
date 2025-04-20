package syntheticExamplesWoFixes.extension.JDGUI

import kotlin.jvm.internal.Intrinsics

object ExtensionJ2K {
    fun greet(`$this$greet`: String): String {
        Intrinsics.checkNotNullParameter(`$this$greet`, "<this>")
        return "Hello, $`$this$greet`"
    }

    fun main() {
        println(greet("World"))
    }
}

fun main(args: Array<String>) {
    ExtensionJ2K.main()
}