package syntheticExamplesWoFixes.abruptControlFlow.Fernflower

object AbruptControlFlowJ2K {
    fun main() {
        for (i in 1..10) {
            var var1: String
            if (i == 5) {
                var1 = "Breaking the loop at $i"
                println(var1)
                break
            }

            if (i % 2 == 0) {
                var1 = "Skipping even number: $i"
                println(var1)
            } else {
                var1 = "Current value: $i"
                println(var1)
            }
        }
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}