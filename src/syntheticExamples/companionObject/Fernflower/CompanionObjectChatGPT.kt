package syntheticExamples.companionObject.Fernflower

class MyClass {
    companion object {
        fun greet() {
            println("Hello from companion object!")
        }
    }
}

fun main() {
    MyClass.greet()
}

