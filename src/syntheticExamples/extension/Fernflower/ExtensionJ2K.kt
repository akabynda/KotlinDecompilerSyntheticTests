package syntheticExamples.extension.Fernflower

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0003¨\u0006\u0004"],
    d2 = ["main", "", "greet", "", "KotlinDecompiler"]
)
 */
object ExtensionJ2K {
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