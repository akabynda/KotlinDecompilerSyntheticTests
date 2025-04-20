package syntheticExamplesWoFixes.list.Fernflower

object ListKt {
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