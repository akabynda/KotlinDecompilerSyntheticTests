package syntheticExamples.scopeFunctions.CFR.ScopeFunctionsJ2K

object ScopeFunctionsKt {
    fun main() {
        val updatedPerson: Person
        var person: Person?
        val person2 =
            (Person("Unknown", 0, null).also { person = it })
        val `$this$main_u24lambda_u240` = person2
        val bl = false
        `$this$main_u24lambda_u240`.name = "Alice"
        `$this$main_u24lambda_u240`.age = 30
        updatedPerson = person2
        var it = updatedPerson
        val bl2 = false
        println(("Person's name is " + it.name) as Any)
        val nameLength = it.name.length
        println(("Name length: $nameLength") as Any)
        val `$this$main_u24lambda_u242` = updatedPerson
        val bl3 = false
        println(("Checking if " + `$this$main_u24lambda_u242`.name + " is adult.") as Any)
        val isAdult = `$this$main_u24lambda_u242`.age >= 18
        println(("Is adult: $isAdult") as Any)
        it = updatedPerson
        val it2 = it
        val bl4 = false
        println(("Sending email to " + it2.email) as Any)
        val `$this$main_u24lambda_u244` = it
        val bl5 = false
        `$this$main_u24lambda_u244`.email = "alice@example.com"
        val `$this$main_u24lambda_u245` = updatedPerson
        val bl6 = false
        val contactInfo = `$this$main_u24lambda_u245`.name + " can be contacted at " + `$this$main_u24lambda_u245`.email
        println(contactInfo as Any)
    }

    @JvmStatic
    fun main(args: Array<String>) {
        main()
    }
}