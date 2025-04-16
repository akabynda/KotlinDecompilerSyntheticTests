/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package syntheticExamplesWoFixes.abruptControlFlow.CFR

object AbruptControlFlowJ2K {
    fun main() {
        for (i in 1..10) {
            if (i == 5) {
                println(("Breaking the loop at $i") as Any)
                break
            }
            if (i % 2 == 0) {
                println(("Skipping even number: $i") as Any)
                continue
            }
            println(("Current value: $i") as Any)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}