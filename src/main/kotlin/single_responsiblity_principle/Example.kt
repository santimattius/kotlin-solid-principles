package single_responsiblity_principle

class Vehicle1(
    val wheelCount: Int,
    val maxSpeed: Int
) {
    fun print() {
        println("wheelCount: $wheelCount, maxSpeed:$maxSpeed")
    }
}

fun main() {
    val vehicle = Vehicle1(wheelCount = 4, maxSpeed = 120)
    vehicle.print()
}