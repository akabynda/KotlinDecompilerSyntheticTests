package syntheticExamples.classWithMethodsAndFields.CFR.PersonJ2K

import kotlin.jvm.internal.Intrinsics

/*
@Metadata(
    mv = [2, 0, 0],
    k = 1,
    xi = 82,
    d1 = ["\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"],
    d2 = ["LclassWithMethodsAndFields/Person/Person;", "", "name", "", "age", "", "<init>", "(Ljava/lang/String;I)V", "sayHello", "", "KotlinDecompiler"]
)

 */
class Person(name: String, age: Int) {
    private val name: String
    private val age: Int

    init {
        Intrinsics.checkNotNullParameter(name as Any, "name")
        this.name = name
        this.age = age
    }

    fun sayHello() {
        println(("\u041f\u0440\u0438\u0432\u0435\u0442, \u043c\u0435\u043d\u044f \u0437\u043e\u0432\u0443\u0442 " + this.name) as Any)
    }
}
