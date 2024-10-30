package syntheticExamples.list.JDGUI
/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 82,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)
 */
object ListJ2K {
    fun main() {
        val arrayOfString = arrayOfNulls<String>(3)
        arrayOfString[0] = "Яблоко"
        arrayOfString[1] = "Банан"
        arrayOfString[2] = "Вишня"
        // Doesn't compile: val syntheticExamples.list: List<*> = listOf<Any>(*(arrayOfString as Array<Any?>))
        val list: List<*> = listOf<Any?>(*(arrayOfString as Array<Any?>))
        // Doesn't compile: for (String fruit : syntheticExamples.list)
        for (fruit in list) println(fruit)
    }
}