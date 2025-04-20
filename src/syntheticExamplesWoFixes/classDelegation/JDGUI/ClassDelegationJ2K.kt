/*
package syntheticExamplesWoFixes.classDelegation.JDGUI

interface Base {
    fun printMessage()
}

/*   */
class BaseImpl/* 7 */
/*   */ /*   */ /*   */(/* 7 */
                        /*   */
                        /*   */ /*   */
                        /*   */
                        /*   */
                        /*   */val message: String
) : Base {
    /*   */ /*   */
    override fun printMessage() {
        /* 9 */
        println(this.message)
        /*   */
    } /*   */
}

/*    */
class Derived(base: Base) : Base {
    /*    */
    init {
        /* 13 */
        this.`$$delegate_0` = base
        /*    */
    }

    /*    */ /*    */
    override fun printMessage() {
        /*    */
        this.`$$delegate_0`.printMessage()
        /*    */
    } /*    */
}

/*    */
object ClassDelegationJ2K {
    /*    */
    fun main() {
        /* 16 */
        val base = BaseImpl("Hello from BaseImpl")
        /* 17 */
        val derived = Derived(base)
        /* 18 */
        derived.printMessage()
        /*    */
    } /*    */
}
 */