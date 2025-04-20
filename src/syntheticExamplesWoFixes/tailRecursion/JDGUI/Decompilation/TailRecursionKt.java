/*
package syntheticExamplesWoFixes.tailRecursion.JDGUI.Decompilation;

import kotlin.Metadata;

@Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\002\n\000\n\002\020\b\n\002\b\003\032\006\020\000\032\0020\001\032\033\020\002\032\0020\0032\006\020\004\032\0020\0032\b\b\002\020\005\032\0020\003H\020¨\006\006"}, d2 = {"main", "", "sum", "", "n", "acc", "KotlinDecompiler"})
public final class TailRecursionKt {
    public static int sum(int n, int acc) {
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

    public static void main() {
        int i = sum$default(10000, 0, 2, null);
        System.out.println(i);
    }
}

 */