package syntheticExamplesWoFixes.extension.Fernflower

import kotlin.jvm.internal.Intrinsics

object ExtensionKt {
    fun greet(`$this$greet`: String): String {
        Intrinsics.checkNotNullParameter(`$this$greet`, "<this>")
        return "Hello, $`$this$greet`"
    }

    fun main() {
        val var0 = greet("World")
        println(var0)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}