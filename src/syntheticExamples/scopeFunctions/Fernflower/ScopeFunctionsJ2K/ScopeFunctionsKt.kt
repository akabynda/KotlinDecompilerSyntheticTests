package syntheticExamples.scopeFunctions.Fernflower.ScopeFunctionsJ2K

/*
@Metadata(
    mv = [2, 0, 0],
    k = 2,
    xi = 48,
    d1 = ["\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"],
    d2 = ["main", "", "KotlinDecompiler"]
)
 */
object ScopeFunctionsKt {
    fun main() {
        val Person = Person("Unknown", 0, null as String?)
        val `$this$main_u24lambda_u240` = Person
        val var4 = false
        `$this$main_u24lambda_u240`.name = "Alice"
        `$this$main_u24lambda_u240`.age = 30
        val updatedPerson = Person
        val it = updatedPerson
        val var5 = false
        val var6 = "Person's name is " + it.name
        println(var6)
        val nameLength = it.name.length
        val var8 = "Name length: $nameLength"
        println(var8)
        var `$this$main_u24lambda_u245` = updatedPerson
        var var13 = false
        var var7 = "Checking if " + `$this$main_u24lambda_u245`.name + " is adult."
        println(var7)
        val isAdult = `$this$main_u24lambda_u245`.age >= 18
        var contactInfo = "Is adult: $isAdult"
        println(contactInfo)
        `$this$main_u24lambda_u245` = updatedPerson
        var13 = false
        var7 = "Sending email to " + `$this$main_u24lambda_u245`.email
        println(var7)
        `$this$main_u24lambda_u245` = updatedPerson
        var13 = false
        `$this$main_u24lambda_u245`.email = "alice@example.com"
        `$this$main_u24lambda_u245` = updatedPerson
        var13 = false
        contactInfo = `$this$main_u24lambda_u245`.name + " can be contacted at " + `$this$main_u24lambda_u245`.email
        println(contactInfo)
    }

    // $FF: synthetic method
    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}
