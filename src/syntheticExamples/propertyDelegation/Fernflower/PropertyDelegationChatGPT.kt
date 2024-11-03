package syntheticExamples.propertyDelegation.Fernflower

import kotlin.properties.Delegates

/**
 * A class representing a user with a name property.
 *
 * The `name` property is delegated using `Delegates.observable` to monitor changes.
 */
class User {
    /**
     * The `name` property of the user.
     *
     * Delegated using `Delegates.observable` to observe and react to changes.
     * - Initial value is set to "<not set>".
     * - Whenever `name` changes, the lambda is invoked with the property, old value, and new value.
     */
    var name: String by Delegates.observable("<not set>") { property, oldValue, newValue ->
        println("Name changed from \"$oldValue\" to \"$newValue\"")
    }
}

/**
 * The main entry point of the application.
 *
 * Demonstrates the usage of the `User` class and the delegated `name` property.
 */
fun main() {
    // Create an instance of User
    val user = User()

    // Set the name to "Alice"
    user.name = "Alice" // Triggers the observer, prints: Name changed from "<not set>" to "Alice"

    // Set the name to "Bob"
    user.name = "Bob"   // Triggers the observer, prints: Name changed from "Alice" to "Bob"
}
