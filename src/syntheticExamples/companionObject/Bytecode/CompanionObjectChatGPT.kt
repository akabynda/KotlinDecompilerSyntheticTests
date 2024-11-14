package syntheticExamples.companionObject.Bytecode

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
