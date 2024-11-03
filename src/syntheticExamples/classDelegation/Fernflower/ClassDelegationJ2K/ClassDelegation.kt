package syntheticExamples.classDelegation.Fernflower.ClassDelegationJ2K

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)
 */
object ClassDelegation {
    fun main() {
        val base = BaseImpl("Hello from BaseImpl")
        val derived = Derived(base as Base)
        derived.printMessage()
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        ClassDelegation.main()
    }
}