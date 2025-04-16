package syntheticExamplesWoFixes.propertyDelegation

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("<not set>") { property, oldValue, newValue ->
        println("Name changed from \"$oldValue\" to \"$newValue\"")
    }
}

fun main() {
    val user = User()
    user.name = "Alice"
    user.name = "Bob"
}