package syntheticExamplesWoFixes.generic.JDGUI

import syntheticExamplesWoFixes.generic.JDGUI.Decompilation.Box

class Box<T>(value: Any) {
    val value: T = value as T
}

object GenericJ2K {
    fun main() {
        val box = Box<String>("Hello")
        println(box.value)
    }
}

fun main(args: Array<String>) {
    GenericJ2K.main()
}