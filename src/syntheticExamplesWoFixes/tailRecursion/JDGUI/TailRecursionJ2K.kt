/*
package syntheticExamplesWoFixes.tailRecursion.JDGUI

object TailRecursionKt {
    fun sum(n: Int, acc: Int): Int {
        // Byte code:
        //   0: iload_0
        //   1: ifne -> 8
        //   4: iload_1
        //   5: goto -> 23
        //   8: iload_0
        //   9: iconst_1
        //   10: isub
        //   11: istore_2
        //   12: iload_1
        //   13: iload_0
        //   14: iadd
        //   15: istore_3
        //   16: iload_2
        //   17: istore_0
        //   18: iload_3
        //   19: istore_1
        //   20: goto -> 0
        //   23: ireturn
        // Line number table:
        //   Java source line number -> byte code offset
        //   #4	-> 0
        // Local variable table:
        //   start	length	slot	name	descriptor
        //   0	24	0	n	I
        //   0	24	1	acc	I
    }

    fun main() {
        val i: Int = `sum$default`(10000, 0, 2, null)
        println(i)
    }
}

 */