/*
// Box.java
package syntheticExamplesWoFixes.generic.Fernflower

class Box(val value: Any)  // GenericKt.java

object GenericKt {
    fun main() {
        val box: Box = Box("Hello")
        val var1: Any = box.getValue()
        println(var1)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
 */