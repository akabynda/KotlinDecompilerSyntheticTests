/*    */
package syntheticExamplesWoFixes.abruptControlFlow.JDGUI

object AbruptControlFlowJ2K {
    /*    */
    fun main() {
        /* 14 */
        for (i in 1..10) {
            /* 15 */
            if (i == 5) {
                /* 16 */
                println("Breaking the loop at $i")
                /*    */
                break
                /*    */
            }

            /* 19 */
            if (i % 2 == 0) {
                /* 20 */
                println("Skipping even number: $i")
                /*    */
            } else {
                /* 23 */
                println("Current value: $i")
                /*    */
            }

            /*    */
        }

        /*    */
    }

    /*    */ /*    */
    @JvmStatic
    fun main(args: Array<String>) {
        /* 28 */
        main()
        /*    */
    } /*    */
}