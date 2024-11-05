package syntheticExamples.generic.CFR.GenericJ2K

object GenericKt {
    fun main() {
        val box = Box("Hello")
        println(box.value as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}