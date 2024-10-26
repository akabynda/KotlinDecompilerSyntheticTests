package list.Fernflower

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)

 */
object ListJ2K {
    fun main() {
        val var1 = arrayOf("Яблоко", "Банан", "Вишня")
        val list: List<*> = listOf(*var1)
        val var3 = list.iterator()

        while (var3.hasNext()) {
            val fruit = var3.next() as String
            println(fruit)
        }
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}