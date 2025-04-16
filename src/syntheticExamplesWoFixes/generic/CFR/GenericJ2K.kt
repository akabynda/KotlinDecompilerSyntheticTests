package syntheticExamplesWoFixes.generic.CFR

object GenericJ2K {
    fun main() {
        val box = Box("Hello")
        println(box.value as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}

class Box<T>(val value: T)