package list.CFR
/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 82,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)
 */
object ListJ2K {
    fun main() {
        val stringArray = arrayOf(
            "\u042f\u0431\u043b\u043e\u043a\u043e",
            "\u0411\u0430\u043d\u0430\u043d",
            "\u0412\u0438\u0448\u043d\u044f"
        )
        val list: List<*> = listOf(*stringArray as Array<Any>)
        // Doesn't compile: for (String fruit : list) {
        for (fruit in list) {
            println(fruit)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}