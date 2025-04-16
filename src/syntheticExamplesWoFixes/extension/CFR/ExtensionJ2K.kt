package syntheticExamplesWoFixes.extension.CFR

import kotlin.jvm.internal.Intrinsics

object ExtensionJ2K {
    fun greet(`$this$greet`: String): String {
        Intrinsics.checkNotNullParameter(`$this$greet` as Any, "<this>")
        return "Hello, $`$this$greet`"
    }

    fun main() {
        println(greet("World") as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}