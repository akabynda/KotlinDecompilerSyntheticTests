package syntheticExamples.abruptControlFlow.CFR

object AbruptControlFlow {
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