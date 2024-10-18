package classWithMethodsAndFields.Fernflower.PersonCodeConvert

import org.jetbrains.annotations.NotNull // Not imported by CodeConvert

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 48,
    d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"],
    d2 = ["LclassWithMethodsAndFields/Person;", "", "name", "", "age", "", "(Ljava/lang/String;I)V", "sayHello", "", "KotlinDecompiler"]
)

 */
class Person(
    @NotNull val name: String, // NotNull is not imported
    val age: Int
) {
    fun sayHello() {
        val message = "Привет, меня зовут $name"
        println(message)
    }
}

