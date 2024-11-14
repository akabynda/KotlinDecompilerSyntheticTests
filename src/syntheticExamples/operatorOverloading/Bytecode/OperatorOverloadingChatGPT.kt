package syntheticExamples.operatorOverloading.Bytecode

data class Vector(val x: Int, val y: Int) {
    operator fun plus(other: Vector): Vector {
        return Vector(this.x + other.x, this.y + other.y)
    }
}

fun main() {
    val v1 = Vector(1, 2)
    val v2 = Vector(3, 4)
    val v3 = v1 + v2
    println(v3)
}
