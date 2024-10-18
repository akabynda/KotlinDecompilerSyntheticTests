package classWithMethodsAndFields.CFR.PersonJ2K

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 82,
    d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004\u0006\u0002\n\u0000\u0006\n"],
    d2 = ["LclassWithMethodsAndFields/Person/Person;", "", "name", "", "age", "", "<init>", "(Ljava/lang/String;I)V", "sayHello", "", "KotlinDecompiler"]
)

 */
class Person(private val name: String, private val age: Int) {
    fun sayHello() {
        println("Привет, меня зовут " + this.name)
    }
}

